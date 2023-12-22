package arrays_Test_10;

public class CountDigitsInArray_219 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(int a:numbers)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		for(int i=0;i<numbers.length;i++)
		{
			int count = 0;
			while(numbers[i] != 0)
			{
				int digit = numbers[i] % 10 ;
				count++;
				numbers[i] =numbers[i] / 10;
			}
			System.out.print(count+" ");
		}
	}

}
