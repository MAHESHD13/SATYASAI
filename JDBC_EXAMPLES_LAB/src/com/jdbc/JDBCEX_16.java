package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class JDBCEX_16 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		
		CallableStatement callableStatement = connection.prepareCall("{ ? = call getAvg(?,?)}");
		callableStatement.setInt(2, 1002);
		callableStatement.setInt(3, 1003);
		
		callableStatement.registerOutParameter(1, Types.FLOAT);
		
		callableStatement.executeUpdate();
		
		System.out.println(callableStatement.getFloat(1));
		
		connection.close();
	}
}


