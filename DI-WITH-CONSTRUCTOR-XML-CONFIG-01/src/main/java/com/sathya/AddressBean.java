package com.sathya;

public class AddressBean 
{
	private String hno;
	private String state;
	public AddressBean() 
	{
		super();
	}
	public AddressBean(String hno, String state) {
		super();
		this.hno = hno;
		this.state = state;
	}
	@Override
	public String toString() {
		return "AddressBean [hno=" + hno + ", state=" + state + "]";
	}
	
}
