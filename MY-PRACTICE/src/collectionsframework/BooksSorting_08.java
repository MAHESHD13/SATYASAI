package collectionsframework;

import java.util.ArrayList;
import java.util.Collections;

public class BooksSorting_08 {

	public static void main(String[] args)
	{
		ArrayList<Books_08> books=new ArrayList<Books_08>();
		
		Books_08 book1=new Books_08();
		book1.setBookId(678);
		book1.setBookName("Corejava");
		book1.setBookAuthor("James Gosling");
		book1.setBookPrice(645.50);
		
		Books_08 book2=new Books_08();
		book2.setBookId(658);
		book2.setBookName("Adv java");
		book2.setBookAuthor("Sathya");
		book2.setBookPrice(455.80);
		
		Books_08 book3=new Books_08();
		book3.setBookId(343);
		book3.setBookName("Spring");
		book3.setBookAuthor("Rod Johnson");
		book3.setBookPrice(123.50);
	
		Books_08 book4=new Books_08();
		book4.setBookId(543);
		book2.setBookName("Spring Boot");
		book2.setBookAuthor("Ram");
		book2.setBookPrice(899.50);
	
		Books_08 book5=new Books_08();
		book5.setBookId(987);
		book5.setBookName("MicroServices");
		book5.setBookAuthor("Ratan");
		book5.setBookPrice(1250.0);
		
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		
		//Collections.sort(books,new BookIdComp());
		
		//Collections.sort(books,new BookPriceComp());
		//Collections.sort(books,new BookNameComp());
		//Collections.sort(books,new BookAuthorComp());
		for(Books_08 book : books)
		{
			System.out.println(book);
		}
	}

}
