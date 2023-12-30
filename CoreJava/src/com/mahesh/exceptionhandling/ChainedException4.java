package com.mahesh.exceptionhandling;

public class ChainedException4
{

	public static void main(String[] args)
	{
		try 
		{
			Exception a=new Exception("Exception");
			a.initCause(new ArithmeticException("Cause of Arithmetic Exception"));
			throw a;
		}
		catch(Exception a)
		{
			System.out.println(a);
			System.out.println(a.getCause());	
		}
		try
		{
			NumberFormatException ab=new NumberFormatException("NumberFormatException");
			ab.initCause(new NullPointerException("Cause Of Null Pointer Eexception"));
			throw ab;
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			System.out.println(e.getCause());
			
		}
	}

}
