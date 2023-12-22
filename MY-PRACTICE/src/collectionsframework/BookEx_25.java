package collectionsframework;

public class BookEx_25 
{
	private Integer bookId;
	private String bookName;
	private Integer bookPrice;
	public BookEx_25(int id, String name, int price)
	{
		this.bookId=id;
		this.bookName=name;
		this.bookPrice=price;	
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "BookEx_25 [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
}
