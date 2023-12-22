package arrays_Test_10;

public class SumSubSequentNumbers_230 
{
	public static void main(String[] args) 
	{
		int[] numbers= {2,3,4,5,6,5,4,3,2,3};
		int search = 15;
		for(int i=0;i<numbers.length-2;i++)
		{
			if(search == numbers[i]+numbers[i+1]+numbers[i+2])
			{
				System.out.println(numbers[i]+" "+numbers[i+1]+" "+numbers[i+2]);
			}
		}
		for(int i=0;i<numbers.length-3;i++)
		{
			if(search == numbers[i]+numbers[i+1]+numbers[i+2]+numbers[i+3])
			{
				System.out.println(numbers[i]+" "+numbers[i+1]+" "+numbers[i+2]+" "+numbers[i+3]);
			}
		}

	}

}
