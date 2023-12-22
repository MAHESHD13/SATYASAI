package loops_Test_9;

import java.util.Scanner;
public class PrimeFactorialCheckFirstNum_13 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("ENTER A NUMBER TO CHECK THE FIRST NUMBER IS A PRIME OR NOT");
		int num=s.nextInt();
		
		int temp = 0,digit=0,fact=0;
		
		while(num > 0)
		{
			digit = num %10;
			num =num/10;
		}
		
		for(int i=2;i<digit;i++)
		{
			if(digit%i==0)
			{
				fact++;
				break;
			}
		}
		if(fact==0)
		{
			System.out.println("PRIME NUMBER IS "+digit);
		}
		else
		{
			System.out.println("NOT A PRIME NUMBER :"+digit);
		}
		
	}

}
