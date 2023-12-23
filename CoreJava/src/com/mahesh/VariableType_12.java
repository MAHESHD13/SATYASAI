package com.mahesh;

public class VariableType_12
{
	int a=10;
	static int b=20;
	public static void m1()
	{
		int c=30;
		System.out.println("C VALUE : "+c);
	}
	public static void main(String[] args)
	{
		VariableType_12 v=new VariableType_12();
		System.out.println("A VALUE : "+v.a);
		System.out.println("B VALUE : "+b);
		v.m1();
		
	}

}
