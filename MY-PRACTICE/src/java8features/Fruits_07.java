package java8features;

import java.util.Map;
import java.util.Map.Entry;

public class Fruits_07 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> fruits=Map.of("Kiwi",20,"Oranges",23,"Apples",78,"Grapes",67,"Mangoes",30,"Pineapple",47,"Banana",45,"Strawberry",37);
		
		//sort the data based on keys
		fruits.entrySet().stream().sorted(Entry.comparingByKey()).forEach(fruit->System.out.println(fruit));
		System.out.println("----------------------------------------");
		
		//sort the data based on values
		fruits.entrySet().stream().sorted(Entry.comparingByValue()).forEach(fruit->System.out.println(fruit));
		
	}

}
