package java8features;

public class Product_03 
{
	private String mobileName;
	private String mobileColor;
	private int mobilePrice;
	public Product_03(String mobileName, String mobileColor, int mobilePrice) {
		super();
		this.mobileName = mobileName;
		this.mobileColor = mobileColor;
		this.mobilePrice = mobilePrice;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public String getMobileColor() {
		return mobileColor;
	}
	public void setMobileColor(String mobileColor) {
		this.mobileColor = mobileColor;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	@Override
	public String toString() {
		return "Product_03 [mobileName=" + mobileName + ", mobileColor=" + mobileColor + ", mobilePrice=" + mobilePrice
				+ "]";
	}
	
	
}
