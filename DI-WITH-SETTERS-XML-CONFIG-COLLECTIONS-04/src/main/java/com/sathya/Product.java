package com.sathya;

import java.util.List;

public class Product {
	private int productId;
	private String productName;
	List<Model> modelObjs;
	
	public Product()
	{
		super();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Model> getModelObjs() {
		return modelObjs;
	}

	public void setModelObjs(List<Model> modelObjs) {
		this.modelObjs = modelObjs;
	}
	
	public void printProductDetails()
	{
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(modelObjs);
	}

}
