package com.mahesh;
import java.util.*;
import java.lang.Error;
public class Random
{

	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		System.out.println("ENTER N VALUE :");
		n=sc.nextInt();
		System.out.println("RAANDOM NUMBER USING RANDOM CLASS : ");
		for(int i=1;i<=5;i++)
		{
			System.out.println(ran.nextInt(100));
		}
		System.out.println("RANDOM NUMBER USING RANDOM METHOD : ");
		for(int i=1;i<=5;i++)
		{
			System.out.println(Math.random());
		}
		
	}

	private char[] nextInt(int i) {
		// TODO Auto-generated method stub
		return null;
	}


}
