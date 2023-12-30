package com.mahesh.exceptionhandling;

public class Demo7 
{

	public static void main(String[] args)
	{
		try 
		{
		   Test7b test1=new Test7b();
		   Test7b test2=new Test7b();
		   Test7b test3=new Test7b();
		}
		catch(NotMoreException7a e)
		{
			System.out.println(e);
		}

	}

}
