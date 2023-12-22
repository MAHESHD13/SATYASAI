package arrays_Test_10;

public class LuckyNumber_211 
{
	public static int iteration(int num)
	{
		int sum =0;
		while(num != 0)
		{
			int digit = num % 10;
			sum = sum + digit;
			num = num /10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int[] numbers = {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(int i = 0;i < numbers.length;i++)
		{
			int sum = 0;
			//int num = numbers[i]; 
			int res = LuckyNumber_211.iteration(numbers[i]);
			if(res > 9)
			{
				int luckyno =LuckyNumber_211.iteration(res);
				System.out.println("LUCKY NUMBER OF "+numbers[i]+"= "+luckyno);
			}
			else
			{
				System.out.println("LUCKY NUMBER OF "+numbers[i]+"= "+res);
			}
		}

	}

}
