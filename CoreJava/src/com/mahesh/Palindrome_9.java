package com.mahesh;
import java.util.Scanner;
public class Palindrome_9
{

	public static void main(String[] args)
	{
		int rem=0,temp,num,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		if(temp==reverse)
		{
			System.out.println("GIVEN "+temp+" IS A PALINDROME NUMBER ");
		}
		else
		{
			System.out.println("GIVEN "+temp+" IS NOT A PALINDROME NUMBER ");
		}
	}

}
