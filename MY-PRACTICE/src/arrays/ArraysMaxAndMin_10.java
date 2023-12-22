package arrays;

public class ArraysMaxAndMin_10 {

	public static void main(String[] args)
	{
		int[] numbers = {20,30,10,40,60};
		int max=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i] > max)
			{
				max = numbers[i];
			}
		}
		int min=numbers[0];
		for(int i=1;i<numbers.length;i++)
		{
			if(numbers[i] < min)
			{
				min = numbers[i];
			}
		}
		System.out.println("Maximum Number..."+max);
		System.out.println("Minimum Number..."+min);

	}

}
