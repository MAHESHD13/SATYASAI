package com.mahesh;
import java.util.Scanner;
public class Armstrong_5
{

	public static void main(String[] args)
	{
		int temp,rem,n1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE OF A NUMBER : ");
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			n1=n1+(rem*rem*rem);
		}
		if(temp==n1)
		{
			System.out.println("GIVEN NUMBER "+temp+" IS AN ARMSTRONG NUMBER ");
		}
		else
		{
			System.out.println("GIVEN NUMBER "+temp+" IS NOT AN ARMSTRONG NUMBER ");
		}
		
	}

}
