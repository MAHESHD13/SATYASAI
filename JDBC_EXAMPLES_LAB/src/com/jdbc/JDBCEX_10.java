package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCEX_10 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		long mobileNo =7893885671l;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//In Application Development Strings are used to store group of characters.Moreover , They are also used to send the data from one Application of one Language  to Another Application of another language
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		PreparedStatement preparedStatement = connection.prepareStatement("delete from user_1 where mobile = ?");
		preparedStatement.setLong(1, mobileNo);
		int result = preparedStatement.executeUpdate();
		if(result > 0)
		{
			System.out.println("DELETION RECORDS ARE...."+result);
		}
		else
		{
			System.out.println("DELETION OPERATION FAIL CHECK ONCE....");
		}
		
		
	}

}
