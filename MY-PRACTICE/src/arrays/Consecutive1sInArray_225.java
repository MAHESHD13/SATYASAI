package arrays;

public class Consecutive1sInArray_225 
{
	public static int Numbers(int[] n)
	{
		int maxcount = 0; 
		int currentcount = 0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]%2 != 0)
			{
				currentcount++;
				maxcount=Math.max(maxcount,currentcount);
			}
			else
			{
				currentcount = 0;
			}
		
		}	
		
		return maxcount;
	}
	public static void main(String[] args) 
	{
		int[] num= {0,0,1,1,0,0,0,1,0,0,1,1,1,0};
		
		int res = Consecutive1sInArray_225 .Numbers(num);
		System.out.println(res);
	}

}
