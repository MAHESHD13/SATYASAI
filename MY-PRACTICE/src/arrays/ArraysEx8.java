package arrays;

public class ArraysEx8 {

	public static void main(String[] args) 
	{
		String[] names = {"arun","ratan","shiva","sathya","john"};
		for(int i = 0;i<names.length;i++)
		{
			if(names[i].equals("sathya"))
			{
				System.out.println(names[i]+"---"+i);
				names[i] = "sathyaTech";
			}
		}
		for(String name : names)
		{
			System.out.println(name);
		}
	}

}
