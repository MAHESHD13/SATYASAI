package arrays;

import java.util.Scanner;

public class ArraysEx_15 {

	public static void main(String[] args) 
	{
		//CREATE THE SCANNER OBJECT
		Scanner s = new Scanner(System.in);
		
		//TAKE THE ARRAY SIZE  FROM END USER
		System.out.println("Enter the size of an array...");
		int size = s.nextInt();
		
		//ARRAY CREATION 
		int[] numbers = new int[size];
		
		//READ THE ALL ELEMENTS FROM ENDUSER
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println("Enter "+i+" index value...");
			numbers[i] = s.nextInt();
		}
		for(int number : numbers)
		{
			System.out.print(number+" ");
		}
		//SUM OF ALL THE ELEMENTS
		int sum = 0;
		for(int i=0;i<numbers.length;i++)
		{
			sum = sum + numbers[i];
		}
		System.out.println("SUM OF ALL THE ELEMENTS = "+sum);
		//CLOSSING THE SCANNER OBJECT
		s.close();
	}

}
