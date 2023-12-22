package arrays_Test_10;

public class SwapFirstAndLast_221 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(int i=0;i<numbers.length;i++)
		{
			int temp =numbers[i];
			numbers[i] = numbers[numbers.length-1];
			numbers[numbers.length-1]=temp;
		}
		for(int num : numbers)
		{
			System.out.print(num+" ");
		}

	}

}
