package arrays_Test_10;

public class SwapFirstEvenAndOddNumbers_222 
{
	public static void main(String[] args) 
	{
		int[] numbers= {11,2,3,-49,5,153,121,145,28,6,3,5,11,-32};
		int index=0;
		int index1=0;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
			{
				index=i;
				break;
			}
		}
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2 !=0)
			{
				index1=i;
				break;
			}
		}
		int temp=numbers[index];		//temp = 1
		numbers[index]=numbers[index1];   // 1  = 0
		numbers[index1]=temp;	
			//0=temp
		for(int num : numbers)
		{
			System.out.print(num+" ");
		}

	}

}
