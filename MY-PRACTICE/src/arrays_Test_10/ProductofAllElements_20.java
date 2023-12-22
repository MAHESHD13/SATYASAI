package arrays_Test_10;

public class ProductofAllElements_20 
{
	public static void main(String[] args) 
	{
		int[] numbers= {10,20,30,40,50};
		int product=1;
		for(int i=1;i<numbers.length;i++)
		{
			product = product *numbers[i];
		}
		System.out.println("PRODUCT OF ALL ELEMENTS IN ARRAY = "+product);
	}

}
