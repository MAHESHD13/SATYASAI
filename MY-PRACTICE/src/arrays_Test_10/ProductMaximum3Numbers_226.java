package arrays_Test_10;

public class ProductMaximum3Numbers_226 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		int n = numbers.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(numbers[i]>numbers[j])
				{
					int temp = numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
					
				}
			}
		}
		for(int num:numbers)
		{
			System.out.print(num+" ");
		}
		System.out.println();
		int prod =numbers[n-1]*numbers[n-2]*numbers[n-3];
		System.out.println("PRODUCT OF THREE MAXIMUM NUMBERS = "+prod);

	}

}
