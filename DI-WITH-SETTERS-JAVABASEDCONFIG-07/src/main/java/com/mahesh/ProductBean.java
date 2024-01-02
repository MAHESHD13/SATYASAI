package com.mahesh;

public class ProductBean 
{
	private int pId;
	private String pName;
	private double price;
	
	//PDC
	public ProductBean() 
	{
		System.out.println("ProductBean.ProductBean()");
	}

	//PSM+PGM
	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//BUSSINESS METHODS
	public void printProducts()
	{
		System.out.println("PRODUCT ID : "+pId);
		System.out.println("PRODUCT NAME : "+pName);
		System.out.println("PRODUCT PRICE : "+price);
	}
	
	

}
