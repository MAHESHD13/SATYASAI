package arrays_Test_10;

public class StrongNumber_208 
{

	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(int i = 0;i <numbers.length;i++ )
		{
			int temp =numbers[i];
			int index=i;
			int sum = 0; 
			while(numbers[i] !=0)
			{
				int fact =1;
				int digit = numbers[i] % 10;
				
				for(int flag=1;flag<=digit;flag++)
				{
					fact =fact*flag;
				}
				sum =sum+fact;
				numbers[i] =numbers[i]/10;
			}
				if(temp == sum)
				{
					System.out.println(sum);
				}
			}
		}

	}

