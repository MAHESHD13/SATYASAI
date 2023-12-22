package arrays;

public class DiagnolSum 
{
	public static void main(String[] args) 
	{
		int[][] numbers= {{3,2,1},{30,10,20},{300,200,100}};
		
		for(int[] num : numbers)
		{
			for(int n : num)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
		//PRINTING DIAGNOL ELEMENTS
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i;j==i;j++)
			{
				System.out.print(numbers[i][j]+" ");
			}
		}
		//PRINTING THE SUM OF ALL DIAGNOL ELEMENTS 
		int sum = 0;
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i;j==i;j++)
			{
				sum = sum + numbers[i][j];
			}
		}
		System.out.println(sum);
		int min =numbers[0][0];
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i;j==i;j++)
			{
				if(numbers[i][j]<min)
				{
					min = numbers[i][j];
				}
			}
		}
		System.out.println(min);
		int max =numbers[0][0];
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i;j==i;j++)
			{
				if(numbers[i][j]>max)
				{
					max = numbers[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
