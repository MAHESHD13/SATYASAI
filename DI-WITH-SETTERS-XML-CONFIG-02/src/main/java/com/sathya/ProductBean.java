package com.sathya;

public class ProductBean 
{
	private int proId;
	private String proName;
	private ModelBean modelObj;
	
	//PUBLIC DEFAULT CONSTRUCTOR
	public ProductBean() 
	{
		super();
	}

	//SETTERS AND GETTERS METHODS
	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public ModelBean getModelObj() {
		return modelObj;
	}

	public void setModelObj(ModelBean modelObj) {
		this.modelObj = modelObj;
	}
	
	//BUSSINESS METHODS
	public void printProduct()
	{
		System.out.println("PRODUCT ID : "+proId);
		System.out.println("PRODUCT NAME  : "+proName);
		System.out.println(modelObj);
		
	}

}
