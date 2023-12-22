package collectionsframework;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class EliminatingDuplicates_04 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(2);
		numbers.add(5);
		numbers.add(5);
		numbers.add(6);
		numbers.add(6);
		numbers.add(5);
		Set<Integer> num=new LinkedHashSet<Integer>(numbers);
		System.out.println(num);
		

	}

}
