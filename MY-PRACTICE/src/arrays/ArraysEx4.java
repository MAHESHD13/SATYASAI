package arrays;

public class ArraysEx4 
{

	public static void main(String[] args) 
	{
		String[] names = new String[5];
		names[0] = "shyam";
		names[1] = "john";
		names[3] = "rohit";
		for(int i=0;i < names.length;i++)
		{
			if(names[i]==null)
			{
				System.out.println(i);
			}
		}
		

	}

}
