package arrays_Test_10;

public class OddIndexElements_13
{
	public static void main(String[] args) 
	{
		int[] numbers= {12,17,16,18,25};
		int index=0;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2!=0)
			{
				index=i;
				System.out.println(numbers[index]);
			}
		}
		
	}

}
