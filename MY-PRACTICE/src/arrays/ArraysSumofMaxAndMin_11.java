package arrays;

public class ArraysSumofMaxAndMin_11 {

	public static void main(String[] args)
	{
		int[] marks= {20,30,10,40,60};
		int max = marks[0];
		int min = marks[0];
		for(int i = 1;i < marks.length;i++)
		{
			if(marks[i] > max)
			{
				max = marks[i];
			}
			if(marks[i] < min)
			{
				min = marks[i];
			}
		}
		int sum = max+min;
		System.out.println("Sum of maximum and minimum numbers is "+sum);
	

	}

}
