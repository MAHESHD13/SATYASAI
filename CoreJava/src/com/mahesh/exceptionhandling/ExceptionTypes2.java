package com.mahesh.exceptionhandling;

public class ExceptionTypes2
{

	public static void main(String[] args) 
	{
		try
		{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a/b;
		System.out.println("RESULT : "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ENTER SECOND NUMBER EXCEPT ZERO");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("BOTH NUMBERS ARE REQUIRED ");
		}
		catch(NumberFormatException e)
		{
			System.out.println("ENTER ONLY INTEGER VALUE");
		}
		finally
		{
			System.out.println("FINAL BLOCK EXECUTED");
		}
	}

}
