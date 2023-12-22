package java8features;

public class Product_10 
{
	private Integer proId;
	private String proname;
	private double proPrice;
	public Product_10(Integer proId, String proname, double proPrice) {
		super();
		this.proId = proId;
		this.proname = proname;
		this.proPrice = proPrice;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	@Override
	public String toString() {
		return "Product_10 [proId=" + proId + ", proname=" + proname + ", proPrice=" + proPrice + "]";
	}
	

}
