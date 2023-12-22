package java8features;

public class Bottle_05 
{
	private String bottleName;
	private String bottleColor;
	private String bottleType;
	private double bottlePrice;
	
	public Bottle_05(String bottleName, String bottleColor, String bottleType, double bottlePrice) {
		super();
		this.bottleName = bottleName;
		this.bottleColor = bottleColor;
		this.bottleType = bottleType;
		this.bottlePrice = bottlePrice;
	}
	public String getBottleName() {
		return bottleName;
	}
	public void setBottleName(String bottleName) {
		this.bottleName = bottleName;
	}
	public String getBottleColor() {
		return bottleColor;
	}
	public void setBottleColor(String bottleColor) {
		this.bottleColor = bottleColor;
	}
	public String getBottleType() {
		return bottleType;
	}
	public void setBottleType(String bottleType) {
		this.bottleType = bottleType;
	}
	public double getBottlePrice() {
		return bottlePrice;
	}
	public void setBottlePrice(double bottlePrice) {
		this.bottlePrice = bottlePrice;
	}
	@Override
	public String toString() {
		return "Bottle_05 [bottleName=" + bottleName + ", bottleColor=" + bottleColor + ", bottleType=" + bottleType
				+ ", bottlePrice=" + bottlePrice + "]";
	}
	
}
