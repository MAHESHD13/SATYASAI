package com.practice;

import java.util.Scanner;

public class GetInputFromUser_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		String s;
		float f;
		
		System.out.println("Enter Your Employee Id : ");
		a = sc.nextInt();
		System.out.println("Enter Your Name : ");
		s = sc.next();
		System.out.println("Enter Your Salary : ");
		f = sc.nextFloat();
		System.out.println(" ***** EMPLOYEE DETAILS ***** ");
		System.out.println("EMPLOYEE ID : "+a);
		System.out.println("EMPLOYEE NAME : "+s);
		System.out.println("EMPLOYEE SALARY : "+f);
	}

}
