package arrays;

import java.util.Scanner;

public class SwapIndexArray_13 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int[] numbers = {10,20,15,5,3};
		System.out.println("Enter first index...");
		int first = s.nextInt();
		System.out.println("Enter Second Index...");
		int second = s.nextInt();
		if((first > 0 && first < numbers.length)&&(second > 0 && second < numbers.length))
		{
			int temp = numbers[first];
			numbers[first] = numbers[second];
			numbers[second] = temp;
		}
		else
		{
			System.out.println("Negative number or index is high");
		}
		for(int number : numbers)
		{
			System.out.println(number);
		}
	}

}
