package com.mahesh;
import java.util.Scanner;
public class PascalsTriangle
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NO OF ROWS YOU WANT : ");
		int rows=sc.nextInt();
		for(int i=0;i<rows;i++)
		{
			for(int k=rows;k>i;k--)
			{
				System.out.print(" ");
			}
			int number=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(number+"  ");
				number=number*(i-j)/(j+1);	
			}
			System.out.println();
		}

	}

}
