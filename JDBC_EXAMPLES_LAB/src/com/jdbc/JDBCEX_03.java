package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEX_03
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		int result = 0;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		System.out.println("Driver Connection To DATABASE...");
		//Statement statement = connection.createStatement();
		//String sqlQuery = "create table user1(userId number,userName varchar2(40),userEmail varchar2(50))";
		//result = statement.executeUpdate(sqlQuery);
		PreparedStatement preparedStatement = connection.prepareStatement("insert into user1 values(10,'saidurga','saidurga@gmail.com')");
		result=preparedStatement.executeUpdate();
		System.out.println("DATA INSERTED SUCCESSFULLY....."+result);
//		System.out.println("TABLE CREATION STATUS....."+result);
	}
	
	

}
