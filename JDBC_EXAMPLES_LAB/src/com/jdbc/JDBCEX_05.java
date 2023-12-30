package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCEX_05
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		System.out.println("Driver Connection To DATABASE...");
		connection.close();
		System.out.println("CLOSE THE DATABASE CONNECTION.....");
	}

}
