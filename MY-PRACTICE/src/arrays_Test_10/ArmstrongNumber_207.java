package arrays_Test_10;

public class ArmstrongNumber_207 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		System.out.println("ARMSTRONG NUMBERS ARE.....");
		for(int number : numbers)
		{
			int num = number;
			int rev = 0;
			while(number != 0 )
			{
				int digit = number % 10 ;
				rev = rev + (digit * digit * digit );
				number = number / 10;
			}
			if(num == rev)
			{
				System.out.print(num+" ");
			}
			
		}

	}

}
