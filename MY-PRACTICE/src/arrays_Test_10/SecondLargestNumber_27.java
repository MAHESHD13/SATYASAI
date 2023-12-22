package arrays_Test_10;

public class SecondLargestNumber_27 
{

	public static void main(String[] args) 
	{
		int[] numbers = {5,10,2,8,12,7,15,11};
		int firstmax = numbers[0];
		int secondmax = numbers[0];
		for(int i = 1;i < numbers.length;i++)
		{
			if(numbers[i]>firstmax)
			{
				secondmax = firstmax;
				firstmax = numbers[i];
			}
			else if(numbers[i] > secondmax)
			{
				secondmax = numbers[i];
			}
		}
		System.out.println("SECOND LARGEST NUMBER = "+secondmax);

	}

}
