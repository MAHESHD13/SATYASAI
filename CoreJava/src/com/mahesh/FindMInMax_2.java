package com.mahesh;
import java.util.Scanner;
public class FindMInMax_2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A VALUE : ");
		int a=sc.nextInt();
		System.out.println("ENTER B VALUE : ");
		int b=sc.nextInt();
		System.out.println("ENTER C VALUE : ");
		int c=sc.nextInt();
		System.out.println("A VALUE : "+a+"\nB VALUE : "+b+"\nC VALUE : "+c);
		int max=(a>b?(a>c?a:c):(b>c?b:c));
		int min=(a<b?(a<c?a:c):(b<c?b:c));
		System.out.println("MAXIMUM VALUE : "+max);
		System.out.println("MINIMUM VALUE : "+min);	

	}

}
