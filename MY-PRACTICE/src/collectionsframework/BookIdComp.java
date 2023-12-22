package collectionsframework;

import java.util.Comparator;

public class BookIdComp implements Comparator<BookEx_25> 
{
	@Override
	public int compare(BookEx_25 b1, BookEx_25 b2)
	{
		return b1.getBookId().compareTo(b2.getBookId());
	}

}
