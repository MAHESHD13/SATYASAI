package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting_07 {

	public static void main(String[] args) 
	{
		ArrayList<String> fruits=new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Kiwi");
		fruits.add("Banana");
		Collections.sort(fruits);
		System.out.println("Ascending Order : "+fruits);
		Collections.sort(fruits,Collections.reverseOrder());
		System.out.println("Descending Order : "+fruits);
	
	}

}
