package arrays_Test_10;

public class PalindromeNumber_210 
{

	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(int num : numbers)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("PALINDROME NUMBERS ");
		for(int i = 0;i < numbers.length;i++)
		{
			int num = numbers[i];
			int rev = 0;
			if(numbers[i]> 10)
			{
				while(numbers[i] != 0)
				{
					int digit = numbers[i] % 10;
					rev = rev * 10 +digit;
					numbers[i] = numbers[i] / 10;
				}
				if(num == rev)
				{
					System.out.print(rev+" ");
				}
			}
		}
	}

}
