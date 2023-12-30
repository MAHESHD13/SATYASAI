package arrays;

public class IdentityMatrix 
{
	public static void main(String[] args) 
	{
		int[][] matrix = {{1,0,0},
						  {0,1,0},
						  {0,0,1}};
		int count=0;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=i;j==i;j++)
			{
				if(matrix[i]== matrix[j])
				{
					count++;
				}
			}
		}
		System.out.println(count);
		if(count == 3)
		{
			System.out.println("MATRIX IS IDENTITY MATRIX...");
		}
		else
		{
			System.out.println("MATRIX IS NOT A IDENTITY MATRIX...");
		}
	}

}
