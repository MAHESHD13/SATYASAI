package com.sathya;

public class ModelBean 
{
	private int modelId;
	private String modelCode;
	private double modelCost;
	private MarginBean mrgObj;
	
	//PUBLIC DEFAULT CONSTRUCTOR
	public ModelBean()
	{
		super();
	}

	//SETTERS AND GETTERS METHODS
	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public String getModelCode() {
		return modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}

	public double getModelCost() {
		return modelCost;
	}

	public void setModelCost(double modelCost) {
		this.modelCost = modelCost;
	}

	public MarginBean getMrgObj() {
		return mrgObj;
	}

	public void setMrgObj(MarginBean mrgObj) {
		this.mrgObj = mrgObj;
	}

	//TOSTRING METHOD
	
	@Override
	public String toString() {
		return "ModelBean [modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", mrgObj="
				+ mrgObj + "]";
	}
	

	
	

}
