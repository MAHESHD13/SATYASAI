package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCEX_08
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		Statement statement = connection.createStatement();

//		CREATE THE TABLE
//		String sql="create table employee12 (empId number,empName varchar2(40),empSalary number ,empEmail varchar2(40))";
//		statement.executeUpdate(sql);

		//INSERT THE DATA
//		PreparedStatement preparedStatement = connection.prepareStatement("insert into employee12 values(1012,'john',50000,'john@gmail.com')");
//		int result = preparedStatement.executeUpdate();
		
		//RETRIEVE THE DATA
		String sql = "select * from employee12 where empName='ratan'";
		
		ResultSet resultSet = statement.executeQuery(sql);
		if(resultSet.next())
		{
			System.out.println("EMP ID : "+resultSet.getInt(1)+"\tEMP NAME : "+resultSet.getString(2)+"\tEMP SALARY : "+resultSet.getInt(3)+"\tEMP EMAIl : "+resultSet.getString(4));
		}
		else
		{
			System.out.println("DATA IS NOT PRESENT....");
		}
		
	}
}
