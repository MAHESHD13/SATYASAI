package arrays_Test_10;

public class FactorialOfElements_204 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
			for(int number : numbers)
			{
				if(number > 0)
				{
					int fact = 1;
					for(int i = 1;i <= number ; i++)
					{
						fact = fact * i ;
					}
				
				System.out.print(fact+" ");
				
			}
		}
	}

}
