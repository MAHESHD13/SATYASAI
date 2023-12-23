package com.mahesh;
import java.util.Scanner;
public class EvenOddZeroCount_13
{

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int zerocount=0,evencount=0,oddcount=0;
		int value;
		
		System.out.println("ENTER  AN INTEGER VALUE : ");
		value=sc.nextInt();
		while(value>0)
		{
			if(value%10==0)
			{
				zerocount++;
			}
			else if(value%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			value=value/10;
		}
		System.out.println();
		System.out.println("ZERO COUNT VALUE : "+zerocount+"\nEVEN COUNT VALUE : "+evencount+"\nODD COUNT VALUE : "+oddcount);

	}

}
