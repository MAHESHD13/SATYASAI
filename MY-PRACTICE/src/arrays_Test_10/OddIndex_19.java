package arrays_Test_10;

public class OddIndex_19 
{
	public static void main(String[] args) 
	{
		int[] numbers= {10,20,30,40,50,60,70};
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			if(i%2!=0)
			{
				sum=sum+numbers[i];
			}
		}
		System.out.println("SUM OF ODD INDEXES = "+sum);
	}

}
