package arrays_Test_10;

public class DivisibleNumbers_201 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(int number : numbers)
		{
			if((number % 3 == 0 && number % 5 == 0)||(number % 7 == 0))
			{
				System.out.print(number+" ");
			}
		}
	}

}
