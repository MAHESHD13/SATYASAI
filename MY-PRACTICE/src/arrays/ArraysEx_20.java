package arrays;

public class ArraysEx_20 
{

	public static void main(String[] args) 
	{
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {10,20,30,40,50};
		int[] res = new int[arr1.length];
		if(arr1.length == arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				res[i] =arr1[i] + arr2[i];
			}
			
		}
		else
		{
			System.out.println("OPERATIONS NOT PERFORMED..");
		}
		for(int result : res)
		{
			System.out.print(result+" ");
		}
	}

}
