package com.mahesh.accessmodifiers;

public class PrivateModifier
{
	private int id=110;
	private String name="SHYAM";
	public void show()
	{
		System.out.println("ID : "+id);
		System.out.println("NAME : "+name);
	}
	
	public static void main(String[] args)
	{
		PrivateModifier pm=new PrivateModifier();
		pm.show();
		System.out.println("ID : "+pm.id+"\t NAME : "+pm.name);
		
	}

}
