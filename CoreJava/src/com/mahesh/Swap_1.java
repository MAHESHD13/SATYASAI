package com.mahesh;
import java.util.Scanner;
public class Swap_1 {

	public static void main(String[] args)
	{
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The A Value : ");
		int a=sc.nextInt();
		System.out.println("Enter The B Value : ");
		int b=sc.nextInt();
		System.out.println("PRINTING THE VALUES BEFORE SWAPPING ");
		System.out.println(" A VALUE : "+a);
		System.out.println(" B VALUE : "+b);
		System.out.println("PRINTING THE VALUES AFTER SWAPPING ");
		/*temp=a;
		a=b;
		b=temp;*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" A VALUE : "+a);
		System.out.println(" B VALUE : "+b);	
	}

}
