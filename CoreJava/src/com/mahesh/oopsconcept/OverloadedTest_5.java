package com.mahesh.oopsconcept;

public class OverloadedTest_5
{
	void show(int a,int b)
	{
		System.out.println("THE SUM OF INTEGERS : "+(a+b));
	}
	void show(double a,double b)
	{
		System.out.println("THE SUM OF DOUBLE NUMBERS : "+(a+b));
	}
	void show(int a,double b)
	{
		System.out.println("THE SUM OF INTEGER AND DOUBLE : "+(a+b));
	}
	void show(double a,int b)
	{
		System.out.println("THE SUM OF DOUBLE AND INTEGER : "+(a+b));
	}
	void show(String a,String b)
	{
		System.out.println("THE SUM OF STRINGS ARE : "+(a+b));
	}
	void show(String a,int b)
	{
		System.out.println("THE SUM OF STRING AND INTEGER : "+(a+b));
	}

	public static void main(String[] args)
	{
		OverloadedTest_5 a=new OverloadedTest_5();
		a.show(15, 20);
		a.show(10.2,23.7);
		a.show(25, 23.8);
		a.show(665.5, 8);
		a.show("HAI", "MAHESH");
		a.show("CODING", 10);
	}

}
