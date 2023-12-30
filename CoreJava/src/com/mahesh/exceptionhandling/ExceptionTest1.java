package com.mahesh.exceptionhandling;

public class ExceptionTest1
{

	public static void main(String[] args)
	{
		int a=20,b=4,c=4,result;
		try
		{
			result=a/(b-c);
			System.out.println("A : "+a+" B : "+b+" = "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ARITHMETIC EXCEPTION DIVISION BY ZERO ");
		}
		finally
		{
			System.out.println("FINALLY BLOCK !");
		}
		result=a/(b+c);
		System.out.println("A : "+a+" B : "+(b+c)+" / "+" = "+result);
		

	}

}
