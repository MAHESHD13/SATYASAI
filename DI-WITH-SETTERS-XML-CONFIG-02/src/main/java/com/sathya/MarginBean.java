package com.sathya;

public class MarginBean 
{
	private int mrgId;
	private String mrgCode;
	
	//PUBLIC DEFAULT CONSTRUCTOR
	public MarginBean() 
	{
		super();
	}
	//SETTERS AND GETTERS METHODS

	public int getMrgId() {
		return mrgId;
	}

	public void setMrgId(int mrgId) {
		this.mrgId = mrgId;
	}

	public String getMrgCode() {
		return mrgCode;
	}

	public void setMrgCode(String mrgCode) {
		this.mrgCode = mrgCode;
	}
	
	//TOSTRING METHOD

	@Override
	public String toString() {
		return "MarginBean [mrgId=" + mrgId + ", mrgCode=" + mrgCode + "]";
	}

	
}
