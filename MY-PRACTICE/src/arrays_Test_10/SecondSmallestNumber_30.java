package arrays_Test_10;

public class SecondSmallestNumber_30 
{

	public static void main(String[] args) 
	{
		int[] numbers = {8,67,53,5,10,25,1};
		
		int firstsmall = numbers[0];
		int secondsmall = numbers[0];
		
		for(int i = 0 ;i< numbers.length;i++)
		{
			if(numbers[i] < firstsmall)
			{
				secondsmall = firstsmall;
				firstsmall = numbers[i];
			}
			else if(numbers[i] < secondsmall )
			{
				secondsmall = numbers[i];
			}
		}
		System.out.println("SECOND SMALLEST ELEMENT = "+secondsmall);
		System.out.println("FIRST SMALLEST ELEMENT = "+firstsmall);

	}

}
