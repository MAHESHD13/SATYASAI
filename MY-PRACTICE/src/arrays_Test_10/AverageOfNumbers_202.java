package arrays_Test_10;

public class AverageOfNumbers_202 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		int sum = 0;
		int length = numbers.length;
		int avg = 0;
		for(int number : numbers)
		{
			sum = sum + number ;
		}
		avg =sum / length;
		System.out.println("AVERAGE OF ARRAY ELEMENTS ARE "+sum);

	}

}
