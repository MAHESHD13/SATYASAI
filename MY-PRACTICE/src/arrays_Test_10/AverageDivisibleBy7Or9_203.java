package arrays_Test_10;

public class AverageDivisibleBy7Or9_203 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		int sum = 0;
		int length = numbers.length;
		int avg = 0;
		for(int number : numbers)
		{
			if(number % 7 == 0 || number % 9 == 0)
			{
				sum = sum +number ;
			}
		}
		avg = sum / length ;
		System.out.println("AVERAGE OF NUMBERS DIVISIBLE BY 7 OR 9 ARE "+avg);
	}

}
