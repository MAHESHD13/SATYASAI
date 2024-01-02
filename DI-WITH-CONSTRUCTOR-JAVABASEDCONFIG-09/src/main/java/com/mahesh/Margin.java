package com.mahesh;

public class Margin 
{
	private int mrgId;
	private String mrgCode;
	
	//PDC
	
	public Margin() 
	{
		super();
	}


	//PPC
	
	public Margin(int mrgId, String mrgCode) {
		super();
		this.mrgId = mrgId;
		this.mrgCode = mrgCode;
	}

	//tostring method
	
	@Override
	public String toString() {
		return "\nMargin Details : mrgId=" + mrgId + ", mrgCode=" + mrgCode ;
	}

}
