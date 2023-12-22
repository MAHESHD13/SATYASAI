package arrays_Test_10;

public class MaximumConsecutive1s_228 
{
	public static void main(String[] args) 
	{
		//int[] a= {0,0,1,1,0,0,0,1,0,0,1,1,1,0};
		int[] a= {1,0,0,0,0,1,0,0,0,1};
		int maximumCount = 0;
		for(int a2:a)
		{
			System.out.print(a2+" ");
		}
		System.out.println();
		
		for(int a1 : a)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
			
				if(a[j]==1)
				{
					count++;
					maximumCount = Math.max(count,maximumCount);				
				}
				else
				{
					count = 0;
				}
			}
		}
		System.out.print("Maximum Consecutive 1's = "+maximumCount);
	}

}
