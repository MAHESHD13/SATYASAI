package com.mahesh.exceptionhandling;

public class Throws3
{
	static void throwMethod1() throws NullPointerException
	{
		System.out.println("INSIDE THROW METHOD 1\n");
		throw new NullPointerException("THROWS DEMO 1\n");
	}
	static void throwmethod2() throws ArithmeticException
	{
		System.out.println("INSIDE THROW METGHOD 2\n");
		throw new ArithmeticException("THROWS DEMO 2\n");
	}

	public static void main(String[] args)
	{
		try
		{
			throwMethod1();
		}
		catch(NullPointerException e)
		{
			System.out.println("EXCEPTION E : "+e);
		}
		try
		{
			throwmethod2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("EXCEPTION E : "+e);
		}
		

	}

}
