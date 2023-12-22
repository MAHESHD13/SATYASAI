package collectionsframework;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx10 {

	public static void main(String[] args) 
	{
		Map<String,Long> countries=new LinkedHashMap<String,Long>();
		countries.put("India",1380004385l);
		countries.put("USA",331000000l);
		countries.put("China",1444216107l);
		countries.put("Brazil",212559417l);
		countries.put("Russia",145912025l);
		Long population=countries.get("India");
		
		System.out.println("INDIA POPULATION : "+population);
		System.out.println("*********************");
		if(countries.containsKey("China"))
		{
			System.out.println("China Population Details is present");
		}
		
		countries.remove("Brazil");
		
		System.out.println("*********************");
		
		String uname="USA";
		Long upopulation=countries.get(uname);
		Long newpopulation=(long) (upopulation*1.1);
		countries.put(uname, newpopulation);
		
		System.out.println("*********************");
		
		for(java.util.Map.Entry<String, Long> country:countries.entrySet())
		{
			String key=country.getKey();
			Long value=country.getValue();
			System.out.println("KEY : "+key+" VALUE : "+value);
		}
		Long maxpop = countries.get("USA");
		String high = null;
		for(java.util.Map.Entry<String, Long> country :countries.entrySet())
		{
			if(country.getValue()>maxpop)
			{
				maxpop=country.getValue();
				high=country.getKey();
				
			}
		}
		System.out.println("HIGHEST POPULATION COUNTRY : "+high);
		System.out.println("*****************************");
		Long minpop = countries.get("India");
		String low = null;
		for(java.util.Map.Entry<String, Long> country :countries.entrySet())
		{
			if(country.getValue()<minpop)
			{
				minpop=country.getValue();
				low=country.getKey();
				
			}
		}
		System.out.println("LOWEST POPULATION COUNTRY : "+low);
	}

}
