package collectionsframework;

import java.util.ArrayList;

public class ArrayList_02 {

	public static void main(String[] args) 
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("ratan");
		names.add("sathya");
		names.add("chandu");
		names.add("sravya");
		names.add("anu");
		names.add("raju");
		names.add("rani");
		System.out.println("NUMBER OF STUDENTS..."+(names.size()-1));
		System.out.println();
		for(String name1:names)
		{
			if(name1.startsWith("r"))
			{
				System.out.println(name1);
			}
		}
		for(String name1:names)
		{
			if(name1.endsWith("a"))
			{
				System.out.println(name1);
			}
		}
		for(String name1:names)
		{
			System.out.print(name1.length()+"  ");
		}
		System.out.println();
		names.remove(names.indexOf("raju"));
		names.set(names.indexOf("sathya"),"sathyatech");
		System.out.println("Index of raju..."+names.indexOf("raju"));
		System.out.println(names.contains("sathya"));
	}

}
