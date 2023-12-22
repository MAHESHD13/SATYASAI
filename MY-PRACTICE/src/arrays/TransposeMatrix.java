package arrays;

public class TransposeMatrix
{
	public static void main(String[] args) 
	{
		int[][] numbers= {{1,2,3},{10,20,30},{100,200,300}};
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers.length;j++)
			{
				System.out.print(numbers[j][i]+" ");	
			}
			System.out.println();
		}
//		for(int[] number : numbers)
//		{
//			for(int n : number)
//			{
//				System.out.print(n+" ");
//			}
//			System.out.println();
//		}

	}

}
