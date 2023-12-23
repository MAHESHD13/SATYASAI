package com.mahesh;
import java.util.Scanner;
public class Fibonacci_11
{
	
	public static void main(String[] args)
	{
		int f1=0,f2=1,fib=0,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO OF TERMS YOU WANT : ");
		number=sc.nextInt();
		System.out.println("FIRST "+number+"NUMBER OF FIBANOCCI SERIES : ");
		for(int count=0;count<number;count++)
		{
			if(count<=1)
			{
				fib=count;
			}
			else
			{
				fib=f1+f2;
				f1=f2;
				f2=fib;
			}
			System.out.println(" "+fib);
		}
		

	}

}
