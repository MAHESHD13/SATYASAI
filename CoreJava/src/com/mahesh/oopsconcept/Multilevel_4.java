package com.mahesh.oopsconcept;
class Account
{
	String name;
	int accountbal;
	Account(String a ,int b)
	{
		name=a;
		accountbal=b;
	}
	void display()
	{
		System.out.printf("CUSTOMER NAME : "+name);
		System.out.printf("\nCUSTOMER ACCOUNT NUMBER : "+accountbal);
	}
	
}
class SavingsAccount extends Account
{
	int minbal,savbal;
	SavingsAccount(String a,int b,int c,int d)
	{
		super(a,b);
		minbal=c;
		savbal=d;	
	}
	void display()
	{
		super.display();
		System.out.printf("\nCUSTOMER MINIMUM ACCOUNT BALANCE :"+minbal);
		System.out.printf("\nCUSTOMER SAVINGS ACCOUNT BALANCE : "+savbal);		
	}
	
}
class AccountDetails extends SavingsAccount
{
	int depbal,withdbal;
	AccountDetails(String a,int b,int c,int d,int e,int f)
	{
		super(a,b,c,d);
		depbal=e;
		withdbal=f;
	}
	void display()
	{
		super.display();
		System.out.printf("\nDEPOSIT BALANCE : "+depbal);
		System.out.printf("\nWITHDRAWL  BALANCE : "+withdbal);
	}
	
}
public class Multilevel_4
{

	public static void main(String[] args)
	{
		AccountDetails A=new AccountDetails("MAHESH",18000,1000,5000,500,4000);
		A.display();
	}

}
