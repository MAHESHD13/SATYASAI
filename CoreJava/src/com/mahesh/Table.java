package com.mahesh;

import java.util.Scanner;

public class Table
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table Number Which You Want :  ");
		int n=sc.nextInt();
		System.out.println("Enter The limited Rows Of A Table : ");
		int l=sc.nextInt();
		System.out.println("MULTIPLICATION TABLE OF "+n+" IS : ");
		for(int c=1;c<=l;c++)
			System.out.println(n+"*"+c+"="+(n*c));		
	}

}
