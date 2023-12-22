package collectionsframework;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StringDataMap_12 {

	public static void main(String[] args) 
	{
		String str="hi ratan sir welcome to satyatech welcome to ratan sir class";
		String[] wordf= str.split(" ");
		Map<String,Integer> entries=new LinkedHashMap<String,Integer>();
		for(int i=0;i<wordf.length;i++)
		{
			entries.put(wordf[i],wordf[i].length());
		}
//		List<Map<String, Integer>> word=Arrays.asList(entries);
//		System.out.println(word);
//		for(java.util.Map.Entry<String, Integer> entry:entries.entrySet())
//		{
//			String key=entry.getKey();
//			Integer value=entry.getValue();
//			System.out.println("KEY = "+key+"  "+"VALUE = "+value);
//		}
//		System.out.println("**************");
		for(java.util.Map.Entry<String, Integer> entry:entries.entrySet())
		{
			String key=entry.getKey();
			System.out.print(key+" ");
		}
		System.out.println();
		System.out.println("***************");
		for(java.util.Map.Entry<String, Integer> entry:entries.entrySet())
		{
			Integer frequency=entry.getValue();
			System.out.print(frequency+" ");
		}
		System.out.println();
		System.out.println("*****************");
		for(java.util.Map.Entry<String, Integer> entry:entries.entrySet())
		{
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.print(key+":"+value+" ");
		}
	}

}
