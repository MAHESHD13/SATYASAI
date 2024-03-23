package com.practice;

import java.util.Scanner;

public class Swapping2NumsWithoutTemp_07 {

	public static void main(String[] args) {

		int x , y ;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A FIRST NUMBER : ");
		x = sc.nextInt();
		System.out.println("ENTER A SECOND NUMBER : ");
		y = sc.nextInt();
		System.out.println(" ***** BEFORE SWAPPING ***** ");
		System.out.println("FIRST NUMBER : "+x);
		System.out.println("SECOND NUMBER : "+y);
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(" ***** AFTER SWAPPING ***** ");
		System.out.println("FIRST NUMBER : "+x);
		System.out.println("SECOND NUMBER : "+y);
	}
}
