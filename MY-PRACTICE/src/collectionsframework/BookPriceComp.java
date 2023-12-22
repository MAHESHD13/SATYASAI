package collectionsframework;

import java.util.Comparator;

public class BookPriceComp implements Comparator <BookEx_25>{

	@Override
	public int compare(BookEx_25 o1, BookEx_25 o2) {
		return o1.getBookPrice().compareTo(o2.getBookPrice());
	}

}
