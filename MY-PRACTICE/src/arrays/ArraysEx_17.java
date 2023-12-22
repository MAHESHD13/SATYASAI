package arrays;

import java.util.Scanner;

public class ArraysEx_17 
{
	public static int[] readIntegers()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements with comma seperated operator..");
		String input = s.nextLine();
		String[] elements = input.split(",");
		int[] numbers = new int[elements.length]; 
		
		for(int i = 0;i<elements.length;i++)
		{
			numbers[i] = Integer.parseInt(elements[i]);
		}
		return numbers;
	}
	public static void main(String[] args) 
	{
		int[] result = ArraysEx_17.readIntegers();
		for(int result1 :result)
		{
			System.out.print(result1+"  ");
		}
	}

}
