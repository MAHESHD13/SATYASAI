package com.sathya;

import java.util.Map;

public class Model 
{
	private int modelId;
	private String modelCode;
	private double modelCost;
	Map<Integer,Margin> marginObjs;
	
	public Model()
	{
		super();
	}

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

	public Map<Integer, Margin> getMarginObjs() {
		return marginObjs;
	}

	public void setMarginObjs(Map<Integer, Margin> marginObjs) {
		this.marginObjs = marginObjs;
	}

	@Override
	public String toString() {
		return "modelId=" + modelId + ", modelCode=" + modelCode + ", modelCost=" + modelCost + ", marginObjs="
				+ marginObjs;
	}
	
	
}
