package arrays_Test_10;

public class FactorsOfElements_205 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(int number : numbers)
		{
			if(number > 0)
			{
				System.out.println("FACTORS OF "+number);
			
				for(int i = 1 ;i <= number ; i++)
				{
					if(number % i == 0)
					{
						System.out.print(i+" ");
					}
				}
				System.out.println();
			}
		}
	}

}
