package arrays_Test_10;

public class SumOfAllDigits_16 
{
	public static void main(String[] args) 
	{
		int[] numbers= {10,20,30,40};
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum=sum+numbers[i];
		}
		System.out.println("SUM OF ARRAY ELEMENTS = "+sum);
	}
}
