package arrays;

public class ArraysEx2 
{

	public static void main(String[] args)
	{
		String[] mobilenames = {"samsung","oppo","honor","realme","redmi","apple","nokia"};	
		
		//GET THE FIRST ELEMENT
		System.out.println(mobilenames[0]);
		System.out.println();
		
		//GET THE 3 - 6 MOBILE NAMES\
		try
		{
			for(int i=2;i<8;i++)
			{
				System.out.println(mobilenames[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please enter the valid range only...");
		}
		System.out.println();
		//GET ALL THE MOBILE NAMES
		for(String mobile : mobilenames)
		{
			System.out.println(mobile);
		}
	}

}
