package com.mahesh;
import java.util.Scanner;
public class Reverse_10
{

	public static void main(String[] args)
	{
		int reverse=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A NUMBER : ");
		int number=sc.nextInt();
		temp=number;
		while(number>0)
		{
			reverse=reverse*10;
			reverse=reverse+number%10;
			number=number/10;		
		}
		System.out.println("REVERSE OF "+temp+" = "+reverse);

	}

}
