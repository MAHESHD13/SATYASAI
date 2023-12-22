package arrays;

import java.util.Scanner;

public class ArraysEx14 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int[] numbers = {10,20,30,40,50};
		System.out.println("Enter a number present in array or not...");
		int index = s.nextInt();
		for(int i = 0;i <numbers.length;i++)
		{
			if(numbers[i] == index)
			{
				System.out.println("Element is Present....."+index);
				break;
			}
			else 
			{
				System.out.println("Element is not present....."+index);
				break;
			}
		}
	}

}
