package arrays;

public class ArraysEx6 
{
	public static void main(String[] args)
	{
		String[] names = {"ratan","anu","sathya","shravya","durga"};
		
		// PRINTING ALL THE NAMES WITH INDEX
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]+"-----"+i);
		}
		
		// PRINTING ALL THE EVEN INDEX ELEMENTS
		for(int i=0;i<names.length;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(names[i]+"*****"+i);
			}
		}
		
		// PRINTING ALL THE ODD INDEX ELEMENTS
		for(int i=0;i<names.length;i++)
		{
			if(i%2 != 0)
			{
				System.out.println(names[i]+"....."+i);
			}
		}
	}

}
