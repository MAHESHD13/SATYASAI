package arrays_Test_10;

public class EvenNumbers_21 {

	public static void main(String[] args) 
	{
		int[] numbers = {2,3,4,5,6,7,8};
		/*for(int number :numbers)
		{
			if(number%2==0)
			{
				System.out.print(number+" ");
			}
		}
		*/
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]%2==0)
			{
				System.out.println(numbers[i]);
			}
		}

	}

}
