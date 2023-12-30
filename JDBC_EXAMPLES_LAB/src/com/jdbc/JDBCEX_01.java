package com.jdbc;

public class JDBCEX_01 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("DRIVER LOADING.........");
	}

}
