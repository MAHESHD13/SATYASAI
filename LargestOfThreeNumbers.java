package com.practice;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x , y , z;
		System.out.println("ENTER FIRST NUMBER : ");
		x = sc.nextInt();
		System.out.println("ENTER SECOND NUMBER : ");
		y = sc.nextInt();
		System.out.println("ENTER THIRD NUMBER : ");
		z = sc.nextInt();
		
		System.out.println("FIRST NUMBER : "+x);
		System.out.println("SECOND NUMBER : "+y);
		System.out.println("THIRD NUMBER : "+z);
		
		if(x > y && x > z)
		{
			System.out.println(x+" IS LARGEST NUMBER ");
		}
		else if(y > x && y > z)
		{
			System.out.println(y+" IS LARGEST NUMBER ");
		}
		else if(z > x && z > y)
		{
			System.out.println(z+" IS LARGEST NUMBER ");
		}
	}

}
