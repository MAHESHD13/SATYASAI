package arrays;

public class SearchElementMatrix 
{
	public static void main(String[] args) 
	{
		int[][] matrix= {{1,2,3},
						 {10,20,30},
						 {100,200,300}};
		int search =200;
		boolean flag =false;
		boolean flag1 = false;
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(search == matrix[i][j])
				{
					flag = true;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println(search+" ELEMENT IS PRESENT ");
		}
		else
		{
			System.out.println(search+" ELEMENT IS NOT PRESENT ");
		}
		
		
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
				if(i==j)
				{
					if(search == matrix[i][j])
					{
						flag1 = true;
						break;
					}
				}
			}
		}
		if(flag1)
		{
			System.out.println(search+" ELEMENT IS PRESENT ");
		}
		else
		{
			System.out.println(search+" ELEMENT IS NOT PRESENT ");
		}
	}

}
