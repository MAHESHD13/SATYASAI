package com.practice;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number1 , number2;
		System.out.println("ENTER FIRST LARGE NUMBER : ");
		number1 = sc.next();
		System.out.println("ENTER SECONND LARGE NUMBER : ");
		number2 = sc.next();
		
		BigInteger first = new BigInteger(number1);
		BigInteger second = new BigInteger(number2);
		BigInteger sum = first.add(second);
		System.out.println("SUM OF "+first+" "+second+" = "+sum);
	}

}
