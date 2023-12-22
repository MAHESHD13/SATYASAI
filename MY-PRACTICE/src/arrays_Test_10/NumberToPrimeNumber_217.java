package arrays_Test_10;

public class NumberToPrimeNumber_217 
{
	public static void main(String[] args) 
	{
		//int a[]= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		int a[] = {2,3,4,5,6,7,8,9,10};
		for(int a1:a)
		{
			System.out.print(a1+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) 
		{	
			if(a[i]>0)
			{
					for(int k=2;k<a[i];k++)
					{
						if(a[i] % k == 0)    //12%2 == 0
						{
							a[i] =a[i]+1;
						}
					}		
				System.out.print(a[i]+"  ");
			}
		}
	}
}

