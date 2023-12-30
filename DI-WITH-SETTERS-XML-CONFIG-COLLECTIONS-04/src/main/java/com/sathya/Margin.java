package com.sathya;

public class Margin 
{
	private Integer marginId;
	private String marginCode;
	
	public Margin() 
	{
		super();
	}

	public int getMarginId() {
		return marginId;
	}

	public void setMarginId(int marginId) {
		this.marginId = marginId;
	}

	public String getMarginCode() {
		return marginCode;
	}

	public void setMarginCode(String marginCode) {
		this.marginCode = marginCode;
	}

	@Override
	public String toString() {
		return "Margin [marginId=" + marginId + ", marginCode=" + marginCode + "]";
	}
	
}
