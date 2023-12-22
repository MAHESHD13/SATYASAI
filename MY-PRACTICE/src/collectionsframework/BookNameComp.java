package collectionsframework;

import java.util.Comparator;

public class BookNameComp implements Comparator<BookEx_25> {

	@Override
	public int compare(BookEx_25 o1, BookEx_25 o2) {
		// TODO Auto-generated method stub
		return o1.getBookName().compareTo(o2.getBookName());
	}

}
