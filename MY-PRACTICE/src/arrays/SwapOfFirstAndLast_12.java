package arrays;

public class SwapOfFirstAndLast_12 {

	public static void main(String[] args)
	{
		int[] numbers = {10,20,15,5,30};
		
		int temp = numbers[0];
		numbers[0] = numbers[numbers.length-1];
		numbers[numbers.length-1] = temp;
		for(int number : numbers)
		{
			System.out.print(number+" ");
		}
	

	}

}
