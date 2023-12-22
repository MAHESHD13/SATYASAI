package collectionsframework;

import java.util.Comparator;

/*public class BookIdComp implements Comparator<Books_08>
{
	@Override
	public int compare(Books_08 b1, Books_08 b2)
	{
		return b1.getBookId().compareTo(b2.getBookId());
	}
}*/


/*public class BookPriceComp implements Comparator<Books_08>
{
	@Override
	public int compare(Books_08 b1, Books_08 b2)
	{
		return b1.getBookPrice().compareTo(b2.getBookPrice());
	}
}
	*/
/*
public class BookNameComp implements Comparator<Books_08>
{
	@Override
	public int compare(Books_08 b1, Books_08 b2)
	{
		return b1.getBookName().compareTo(b2.getBookName());
	}
}*/
public class BookAuthorComp implements Comparator<Books_08>
{
	@Override
	public int compare(Books_08 b1, Books_08 b2)
	{
		return b1.getBookAuthor().compareTo(b2.getBookAuthor());
	}
}
