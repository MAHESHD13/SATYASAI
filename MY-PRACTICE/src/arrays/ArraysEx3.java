package arrays;

public class ArraysEx3 
{

	public static void main(String[] args) 
	{
		String[] names = new String[5];
		names[2]="Ratan";
		for(String name :names)
		{
			System.out.println(name);
		}
		int[] numbers = new int[5];
		numbers[2] = 89;
		numbers[3] = 99;
		for(int number : numbers)
		{
			System.out.println(number);
		}
	}

}
