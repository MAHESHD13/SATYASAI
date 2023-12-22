package arrays_Test_10;

public class PrimeNumbers_206 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		System.out.println("PRIME NUMBERS ARE...");
		for(int number : numbers)
		{
			int flag = 0;
			for(int i = 2 ; i < number ; i++)
			{
				if(number % i == 0)
				{
					flag++;
				}
			}
			if(flag == 0)
			{
				System.out.print(number+" ");
			}
		}

	}

}
