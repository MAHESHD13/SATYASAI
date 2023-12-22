package arrays_Test_10;

public class NegativeRightPositiveLeft_224
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		int[] a =new int[numbers.length];
		int l=0,r=numbers.length-1;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>0)
			{
				a[l++]=numbers[i];
			}
			else
			{
				a[r--]=numbers[i];
			}
		}
		for(int a1:a)
		{
			System.out.print(a1+" ");
		}
	}

}
