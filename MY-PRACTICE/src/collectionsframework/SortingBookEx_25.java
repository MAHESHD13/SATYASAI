package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;

public class SortingBookEx_25 
{
	public static void main(String[] args) 
	{
		ArrayList<BookEx_25> books=new ArrayList<BookEx_25>();
		books.add(new BookEx_25(102,"java",1000));
		books.add(new BookEx_25(101, "python", 500));
		books.add(new BookEx_25(105, "spring boot", 1500));
		books.add(new BookEx_25(104, "angular", 300));
		books.add(new BookEx_25(103, "sql", 200));
		
		//Collections.sort(books,new BookIdComp());
		//Collections.sort(books,new BookNameComp());
		Collections.sort(books,new BookPriceComp());
		for(BookEx_25 book:books)
		{
			System.out.println(book);
		}
		
	}

}
