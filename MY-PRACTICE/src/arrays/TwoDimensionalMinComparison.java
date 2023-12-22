package arrays;

public class TwoDimensionalMinComparison 
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
		// PRINTING OF MINIMUM OF ALL NUMBERS
		int min=numbers[0][0];
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers[i].length;j++)
			{
				if(numbers[i][j] < min)
				{
					min = numbers[i][j];
				}
			}
		}
		System.out.println("MIN OF ALL NUMBERS..."+min);
		
		// PRINTING OF MINIMUM OF EACH ROW
		System.out.print("MINIMUM OF EACH ROW...");
		for(int i=0;i<numbers.length;i++)
		{
			int rowmin=numbers[i][0];
			for(int j=0;j<numbers[i].length;j++)
			{
				if(numbers[i][j]<rowmin)
				{
					rowmin = numbers[i][j];
				}
			}
			System.out.print(rowmin+" ");
		}
		System.out.println();
		
		//MINIMUM OF EACH COLUMN
		System.out.print("MINIMUM OF EACH COLUMN...");
		for(int i=0;i<numbers.length;i++)
		{
			int colmin=numbers[0][i];
			for(int j=0;j<numbers[i].length;j++)
			{
				
				if(numbers[j][i]<colmin)
				{
					colmin = numbers[j][i];
				}
			}
			System.out.print(colmin+" ");
		}
		
		
	}

}
