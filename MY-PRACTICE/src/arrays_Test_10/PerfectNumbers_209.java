package arrays_Test_10;

public class PerfectNumbers_209
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		System.out.println("PERFECT NUMBER ARE.....");
		for(int i=0;i<numbers.length;i++)
		{
			int num =numbers[i];
			int sum = 0;
			for(int j=1;j<numbers[i];j++)
			{
				if(numbers[i] % j==0)
				{
					sum =sum+j;
				}
			}
			if(num == sum)
			{
				System.out.print(num+" ");
			}
		}

	}

}
