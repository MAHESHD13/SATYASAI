package collectionsframework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OrdersMap_15 {

	public static void main(String[] args) 
	{
		Map<String,ArrayList<String>> orders=new LinkedHashMap<String,ArrayList<String>>();
		ArrayList<String> order1=new ArrayList<String>();
		order1.add("dosa");
		order1.add("idly");
		order1.add("poori");
		
		ArrayList<String> order2=new ArrayList<String>();
		order2.add("pizza");
		order2.add("pasta");
		order2.add("burger");
		
		ArrayList<String> order3=new ArrayList<String>();
		order3.add("chicken");
		order3.add("mutton");
		order3.add("fish");
		
		ArrayList<String> order4=new ArrayList<String>();
		order4.add("dal");
		order4.add("panner");
		order4.add("sambar");
		
		orders.put("GT378",order1);
		orders.put("AB123",order2);
		orders.put("XY789",order3);
		orders.put("MK345",order4);
		
		ArrayList<String> order5=new ArrayList<String>(order1);
		order5.add("setdosa");
		order5.add("bonda");
		
		System.out.println(orders.get("XY789"));
		System.out.println("****************");
		for(Entry<String, ArrayList<String>> entry:orders.entrySet())
		{
			System.out.println(entry);
		}
		System.out.println("***********************");
		orders.remove("AB123");
		
		orders.put("GT378",order5);
		for(Entry<String, ArrayList<String>> entry:orders.entrySet())
		{
			System.out.println(entry);
		}
	}

}
