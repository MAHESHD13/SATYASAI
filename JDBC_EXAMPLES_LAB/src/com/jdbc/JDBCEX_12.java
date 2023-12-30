package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCEX_12 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//In Application Development Strings are used to store group of characters.Moreover , They are also used to send the data from one Application of one Language  to Another Application of another language
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		Statement statement = connection.createStatement();
		String sql = "select * from employee12 where empsalary > 10000";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			System.out.println("Employee Id :"+resultSet.getInt(1)+"\tEmployee Name : "+resultSet.getString(2)+"\tEmployee Salary : "+resultSet.getInt(3)+"\tEmployee Email : "+resultSet.getString(4));
		}
		
	}

}
