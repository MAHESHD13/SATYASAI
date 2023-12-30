package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCEX_11 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//In Application Development Strings are used to store group of characters.Moreover , They are also used to send the data from one Application of one Language  to Another Application of another language
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		//PreparedStatement preparedStatement = connection.prepareStatement("update employee12 set empName ='deva',empEmail ='deva@gmail.com' where empId = 123");
		Statement statement = connection.createStatement();
		String sql = "select * from employee12 where empId=123";
		ResultSet resultSet = statement.executeQuery(sql);
		if(resultSet.next())
		{
			System.out.println("Employee Id :"+resultSet.getInt(1)+"\nEmployee Name : "+resultSet.getString(2)+"\nEmployee Salary : "+resultSet.getInt(3)+"\nEmployee Email : "+resultSet.getString(4));
		}
		else
		{
			System.out.println("data updation fail check once......");
		}
		
		
		
	}

}
