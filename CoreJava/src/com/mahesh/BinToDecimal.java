package com.mahesh;
import java.util.Scanner;
public class BinToDecimal
{

	public static void main(String[] args)
	{
		int decimal=0,power=0,temp,binarynum,binary;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE BINARY VALUE : ");
		binarynum=sc.nextInt();
		binary=binarynum;
		while(true)
		{
			if(binary==0)
			{
				break;
			}
			else
			{
				temp=binary%10;
				decimal+=temp*Math.pow(2,power);
				binary=binary/10;
				power++;
			}
			System.out.println("BINARY VALUE : "+binary+"DECIMAL VALUE : "+decimal);
		}
		System.out.println("BINARY VALUE : "+binarynum+"         DECIMAL VALUE : "+decimal);
	}

}
