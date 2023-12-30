package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCEX_06
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		Statement statement = connection.createStatement();
		String sqlQuery = "select * from user1";
		ResultSet resultSet = statement.executeQuery(sqlQuery);
		if(resultSet.next())
		{
			System.out.println("USER ID : "+resultSet.getInt(1)+"\tUSER NAME : "+resultSet.getString(2)+"\tUSER EMAIL : "+resultSet.getString(3));
		}
	}
}
