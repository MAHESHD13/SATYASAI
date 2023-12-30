package com.mahesh.exceptionhandling;

public class CustomException5
{

	public static void main(String[] args) throws Exception
	{
		CustomException5 custom=new CustomException5();
		custom.display();
	}
	public void display() throws CustomException5a
	{
		for(int i=2;i<=20;i=i+2)
		{
			System.out.println("I = "+i);
			if(i==8)
			{
				throw new CustomException5a("My Exception occured");
			}
		}
	}

}
