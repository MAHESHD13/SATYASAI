package Exception_handling_Test15;

import java.util.Scanner;

class NegativeNumberException extends RuntimeException
{
	public NegativeNumberException(String msg) 
	{
		super(msg);
		
	}
}
class ZeroException extends RuntimeException
{
	public ZeroException(String msg) 
	{
		super(msg);
	}
}
public class NegativeNumberAndZeroException_3 
{
	public static void  validateNumber(int num)
	{
		if(num < 0)
		{
			throw new NegativeNumberException("PLEASE ENTER A POSITIVE NUMBER..... ");
		}
		else if(num > 0)
		{
			System.out.println("YOUR NUMBER IS VALID....");
		}
		else
		{
			throw new ZeroException("NUMBER IS ZERO");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER YOUR NUMBER....");
		int number=s.nextInt();
		NegativeNumberAndZeroException_3.validateNumber(number);

	}

}
