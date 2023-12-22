package arrays_Test_10;

public class DuplicatesInArray_218 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(int a:numbers)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		for(int i =0 ;i<numbers.length;i++)
		{
			for(int j =i+1;j<numbers.length;j++)
			{
				if(numbers[i] == numbers[j])
				{
					System.out.print(numbers[i]+" ");
				}
			}
		}
	}

}
