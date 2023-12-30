package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCEX_09 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//In Application Development Strings are used to store group of characters.Moreover , They are also used to send the data from one Application of one Language  to Another Application of another language
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		PreparedStatement preparedStatement = connection.prepareStatement("insert into user_1 values(?,?,?,?)");
		preparedStatement.setString(1, "DSVDURGA");
		preparedStatement.setString(2, "dsvdurga@");
		preparedStatement.setString(3, "dsvdurga234@gmail.com");
		preparedStatement.setLong(4,7893885671l);

		int result = preparedStatement.executeUpdate();
		if(result == 1)
		{
			System.out.println("DATA INSERTED SUCCESSFULLY....."+result);
		}
		else
		{
			System.out.println("DATA INSERTION FAIL CHECK ONCE....."+result);
		}
	}

}
