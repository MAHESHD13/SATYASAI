package com.mahesh;

public class Model 
{
	private int modelNo;
	private String modelName;
	private double price;
	private String companyName;
	
	//PDC
	
	public Model() 
	{
		super();
	}
	
	//PPC
	
	public Model(int modelNo, String modelName, double price, String companyName) {
		super();
		this.modelNo = modelNo;
		this.modelName = modelName;
		this.price = price;
		this.companyName = companyName;
	}

	//generate toString method
	
	@Override
	public String toString() {
		return "modelNo=" + modelNo + ", modelName=" + modelName + ", price=" + price + ", companyName="
				+ companyName;
	}
	

}
