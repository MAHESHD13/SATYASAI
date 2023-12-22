package arrays_Test_10;

public class OddNumberToEvenNumbers_216 
{
	public static void main(String[] args) 
	{
		int[] a= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		for(int a1:a)
		{
			System.out.print(a1+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2 != 0)
			{
				a[i] =a[i]+1;
			}
		}
		System.out.println("EVEN NUMBERS....");
		for(int a1:a)
		{
			System.out.print(a1+" ");
		}

	}

}
