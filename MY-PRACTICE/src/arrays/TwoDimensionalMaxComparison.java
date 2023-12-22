package arrays;

public class TwoDimensionalMaxComparison 
{
	public static void main(String[] args) 
	{
		int[][] numbers= {{1,2,3},{10,20,30},{100,200,300}};
		
		// PRINTING OF MAXIMUM OF ALL NUMBERS
		int max=numbers[0][0];
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers[i].length;j++)
			{
				if(numbers[i][j] > max)
				{
					max = numbers[i][j];
				}
			}
		}
		System.out.println("MAXIMUM OF ALL NUMBERS..."+max);
		
		// PRINTING OF MAXIMUM OF EACH ROW
		System.out.println("MAXIMUM OF EACH ROW...");
		for(int i=0;i<numbers.length;i++)
		{
			int rowmax=numbers[i][0];
			for(int j=0;j<numbers.length;j++)
			{
				if(numbers[i][j]>rowmax)
				{
					rowmax = numbers[i][j];
				}
			}
			System.out.print(rowmax+" ");
		}
		System.out.println();
		
		//MAXIMUM OF EACH COLUMN
		System.out.println("MAXIMUM OF EACH COLUMN...");
		for(int i=0;i<numbers.length;i++)
		{
			int colmax=numbers[0][i];
			for(int j=0;j<numbers.length;j++)
			{
				
				if(numbers[j][i]>colmax)
				{
					colmax = numbers[j][i];
				}
			}
			System.out.print(colmax+" ");
		}
		
		
	}

}
