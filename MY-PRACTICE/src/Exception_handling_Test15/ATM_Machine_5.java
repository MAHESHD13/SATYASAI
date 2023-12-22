package Exception_handling_Test15;

import java.util.Scanner;

class InsufficientFundsException extends RuntimeException
{
	public InsufficientFundsException(String msg) 
	{
		super(msg);
	}
}
public class ATM_Machine_5 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		int accountBalance = 10000;
		int withdraw=0;
		int deposit = 0;
		
		System.out.println("ENTER THE OPTION WITHDRAW / DEPOSIT.....");
		String option=s.next();
		
		if(option.equalsIgnoreCase("withdraw"))
		{
			System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW .....");
			withdraw = s.nextInt();
			if(withdraw > accountBalance)
			{
				throw new InsufficientFundsException("WITHDRAW MONEY IS NOT AVAILABLE IN YOUR ACCOUNT....." );
			}
			else
			{
				accountBalance -= withdraw;
				System.out.println("CURRENT ACCOUNT BALANCE IS ....."+accountBalance);
			}
		}
		else if(option.equalsIgnoreCase("deposit"))
		{
			System.out.println("ENTER THE AMOUNT YOU WANT TO DEPOSIT .....");
			deposit = s.nextInt();
			
			accountBalance += deposit;
			System.out.println("CURRENT ACCOUNT BALANCE IS ....."+accountBalance);
		}
		else
		{
			System.out.println("ENTER THE VALID OPTION .....");
		}

	}

}
