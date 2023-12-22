package arrays_Test_10;

public class MaximumNumber_26 
{
	public static void main(String[] args) 
	{
		int[] numbers = {5,10,3,80,61};
		int max=numbers[0];
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i] > max)
			{
				max = numbers[i];
			}
		}
		System.out.print("MAXIMUM NUMBER = "+max);
	}

}
