package arrays;

public class NamesEx 
{

	public static void main(String[] args) 
	{
		String[] names = {"ratan","arun","sathya","shiva","durga"};
		for(int i=0;i<names.length;i++)
		{
			if(names[i].equalsIgnoreCase("sathya"))
			{
				System.out.println(names[i]+"*****"+i);
				names[i] = "SathyaTech";
			}
			else
			{
				System.out.println("Sathya is not present");
			}
		}
			for(String name : names)
			{
				System.out.println(name);
			}
		
	}

}
