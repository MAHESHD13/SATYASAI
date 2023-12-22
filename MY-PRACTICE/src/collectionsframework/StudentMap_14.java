package collectionsframework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentMap_14 {

	public static void main(String[] args)
	{
		Map<Integer,String> names=new LinkedHashMap<Integer,String>();
		names.put(101,"Ratan");
		names.put(102, "Sathya");
		names.put(103,"James");
		names.put(104, "Jhonson");
		Map<Integer, String> names1=new LinkedHashMap<Integer,String>();
		names1.put(101,"CSE");
		names1.put(102,"ECE");
		names1.put(103,"CSE");
		names1.put(104,"EEE");
		Integer value1=0;
		for(Entry<Integer,String> entry:names1.entrySet())
		{
			if(entry.getValue().equals("CSE"))
			{
				value1=entry.getKey();
				System.out.println(names.get(value1)+" : "+value1);
			}
		}
	}

}
