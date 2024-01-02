package com.mahesh;

public class Model 
{
	private int modelId;
	private String modelCode;
	private double modelCost;
	private Margin mgObj;
	
	//PDC
	
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}

	//PPC
	
	public Model(int modelId, String modelCode, double modelCost, Margin mgObj) {
		super();
		this.modelId = modelId;
		this.modelCode = modelCode;
		this.modelCost = modelCost;
		this.mgObj = mgObj;
	}
	
	//toString method

	@Override
	public String toString() 
	{
		return "modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost+ mgObj;
	}
	
	

}
