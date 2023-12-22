package arrays;

public class TwoDimensionalEx1 
{
	public static void main(String[] args) 
	{
		int[][] numbers= {{1,2,3},{10,20,30},{100,200,300}};
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers[i].length;j++)
			{
				sum=sum+numbers[i][j];
			}
		}
		System.out.println("SUM OF ALL ARRAY ELEMENTS = "+sum);
		System.out.print("SUM OF EACH ROW...");
		for(int i=0;i<numbers.length;i++)
		{
			int rowsum=0;
			for(int j=0;j<numbers[i].length;j++)
			{
				rowsum=rowsum+numbers[i][j];
			}
			System.out.print(rowsum+" ");
		}
		System.out.println();
		System.out.print("SUM OF EACH COLUMN...");
		for(int i=0;i<numbers.length;i++)
		{
			int colsum=0;
			for(int j=0;j<numbers[i].length;j++)
			{
				colsum=colsum+numbers[j][i];
			}
			System.out.print(colsum+" ");
		}
	}

}
