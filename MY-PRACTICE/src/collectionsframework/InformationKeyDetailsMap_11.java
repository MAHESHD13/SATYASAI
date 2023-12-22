package collectionsframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class InformationKeyDetailsMap_11 {

	public static void main(String[] args) 
	{
		Map<Integer,String> informations=new HashMap<Integer,String>();
		informations.put(100,"Information Response");
		informations.put(200,"Successful Response");
		informations.put(300,"Redirection Messages");
		informations.put(400,"Client Error Response");
		informations.put(500,"Server Error Response");
		
		for(Entry<Integer, String> information:informations.entrySet())
		{
			String value=information.getValue();
			System.out.println(value);
		}
		System.out.println("*************************");
	
		informations.put(600,"Custom Error");
		
		for(Entry<Integer, String> information:informations.entrySet())
		{
			String value=information.getValue();
			System.out.println(value);
		}
		System.out.println("*************************");
		
		informations.put(200,"OK");
		for(Entry<Integer, String> information:informations.entrySet())
		{
			String value=information.getValue();
			System.out.println(value);
		}
	}

}
