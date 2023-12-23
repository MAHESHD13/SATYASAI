package com.mahesh;
import java.util.Scanner;
public class PrimeNumber_4
{

	public static void main(String[] args)
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FIRST VALUE : ");
		int number1=sc.nextInt();
		System.out.println("ENTER THE RANGE VALUE : ");
		int number2=sc.nextInt();
		System.out.println("ODD NUMBERS BETWEEN "+number1+" AND "+number2+" ARE : ");
		for(int i=number1;i<=number2;++i)
		{
			for(int j=2;j<=number1/2;++j)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
				else
					flag=0;
			}
			if (flag==0)
			{
				System.out.println(i);
			}
		}

	}

}
