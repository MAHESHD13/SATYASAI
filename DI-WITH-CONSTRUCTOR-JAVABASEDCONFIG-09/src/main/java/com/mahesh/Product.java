package com.mahesh;

public class Product 
{
	private int prodId;
	private String prodName;
	private Model modelObj;
	
	//PDC
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	//PPC
	
	public Product(int prodId, String prodName, Model modelObj) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.modelObj = modelObj;
	}
	

	public void printProducts()
	{
		System.out.println("PRODUCT ID : "+prodId);
		System.out.println("PRODUCT NAME : "+prodName);
		System.out.println("MODEL DETAILS : "+modelObj);
	}

}
