package arrays;

public class ArraysSumAndProd_9 {

	public static void main(String[] args) 
	{
		int[] marks = {10,20,30,40,50};
		int sum = 0;
		int prod =1;
		for(int i=0;i<marks.length;i++)
		{
			sum =sum+marks[i];
		}
		System.out.println("Sum of All Elements..."+sum);
		for(int i=0;i<marks.length;i++)
		{
			prod =prod * marks[i];
		}
		System.out.println("Product of All Elements..."+prod);
	}

}
