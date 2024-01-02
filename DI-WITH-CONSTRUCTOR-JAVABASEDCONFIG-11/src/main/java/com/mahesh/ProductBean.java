package com.mahesh;

import java.util.List;
import java.util.Map;

public class ProductBean 
{
	private int prodId;
	private String prodName;
	private Map<String,Integer> myMap;
	List<Model> modelObj;
	
	//PDC
	
	public ProductBean() 
	{
		super();	
	}
	
	//PPC
	
	public ProductBean(int prodId, String prodName, Map<String, Integer> myMap, List<Model> modelObj) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.myMap = myMap;
		this.modelObj = modelObj;
	}
	
	//BUSSINESS METHODS
	
	public void printProducts()
	{
		System.out.println("PRODUCT ID : "+prodId);
		System.out.println("PRODUCT NAME : "+prodName);
		System.out.println("COMPANY NAME AND NUMBER OF PRODUCTS : "+myMap);
		System.out.println("MODEL DETAILS : "+modelObj);
	}
	

}
