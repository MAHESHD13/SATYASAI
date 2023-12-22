package arrays_Test_10;

public class MaximumOccuredElement_225 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,11,5,-32};
		int maximumOccurElement = 0;
		int index=0;
		for(int i=0;i<numbers.length;i++)
		{
			int count = 0;
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					count++;
					index=j;
				}
			}
				if(count > maximumOccurElement)
				{
					maximumOccurElement = count;
				}
			}	
		
		System.out.println(numbers[index]);
	}

}
