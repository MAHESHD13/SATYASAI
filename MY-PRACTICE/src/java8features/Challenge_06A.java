package java8features;

public class Challenge_06A 
{
	private Integer proId;
	private String proName;
	private Integer proPrice;
	public Challenge_06A(Integer proId, String proName, Integer proPrice) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proPrice = proPrice;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(double d) {
		this.proId = (int) d;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Integer getProPrice() {
		return proPrice;
	}
	public void setProPrice(double d) {
		this.proPrice = (int) d;
	}
	@Override
	public String toString() {
		return "Challenge_06A [proId=" + proId + ", proName=" + proName + ", proPrice=" + proPrice + "]";
	}
	
	

}
