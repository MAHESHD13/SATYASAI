package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEX_18 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		connection.setAutoCommit(false);
		Statement statement = connection.createStatement();
		statement.addBatch("create table product121(color varchar2(30),height number)");
		statement.addBatch("insert into product121 values('black',5.6");
		statement.addBatch("insert into product121 values('red',6.6");
		statement.addBatch("insert into product121 values('green',7.6");
		statement.addBatch("delete from product121 where height >6.0");
		statement.addBatch("drop table product121");
		int[] results = statement.executeBatch();
		for(int result : results)
		{
			System.out.println(result);
		}
		connection.close();
	}

}
