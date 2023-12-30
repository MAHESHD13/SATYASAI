package com.jdbc.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreationEx_01 
{
	public static void main(String[] args) 
	{
		Connection connection;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
			 
			 System.out.println("Connection Created Successfully.....");
			 connection.close();
			 System.out.println("Connection Closed Successfully.....");
				
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
