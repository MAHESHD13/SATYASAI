package collectionsframework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomanNnumbers_13 {

	public static void main(String[] args) 
	{
		Map<Character,Integer>numbers=new LinkedHashMap<Character,Integer>();
		numbers.put('I', 1);
		numbers.put('V',5);
		numbers.put('X',10);
		numbers.put('L',50);
		numbers.put('C',100);
		numbers.put('D',500);
		numbers.put('M',1000);
		
		String name="XV";//XXV,VI
		int b=0,sum=0;
		for(int i=0;i<name.length();i++) 
		{
			char ch=name.charAt(i);
	
			int a=numbers.get(ch);
			
			if(a<b)
				sum=sum-a;
			else 
				sum=sum+a;	
		}
		System.out.println(sum);
	}

}
