package com.mahesh;
import java.util.Scanner;
public class Factorial_3
{

	public static void main(String[] args)
	{
		int fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE FACTORIAL VALUE :");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++)
			fact=fact*i;
		System.out.println("FACTORIAL OF A "+number+"= "+fact);

	}

}
