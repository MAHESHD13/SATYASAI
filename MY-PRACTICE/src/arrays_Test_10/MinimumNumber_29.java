package arrays_Test_10;

public class MinimumNumber_29 
{
	public static void main(String[] args) 
	{
		int[] numbers = {5,10,3,80,61};
		int min=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i] < min)
			{
				min = numbers[i];
			}
		}
		System.out.print("MINIMUM NUMBER = "+min);
	}

}
