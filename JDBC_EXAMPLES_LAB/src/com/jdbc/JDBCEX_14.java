package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JDBCEX_14 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		List<Product> products=new ArrayList<Product>();
		Product p=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//In Application Development Strings are used to store group of characters.Moreover , They are also used to send the data from one Application of one Language  to Another Application of another language
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		
		//create the product table 
		Statement statement =connection.createStatement();
//		String sql ="create table product12 (productId number ,productName varchar2(40),productPrice number,productQuantity number)";
//		
//		int result = statement.executeUpdate(sql);
//		System.out.println(result);
		//insert the data into product12 table
//		PreparedStatement preparedStatement = connection.prepareStatement("insert into product12 values(1003,'sugar',200,4)");
//		int result = preparedStatement.executeUpdate();
//		System.out.println(result);
		String sql = "select * from product12";
		ResultSet resultSet =statement.executeQuery(sql);
		if(resultSet.next())
		{
			p=new Product();
			p.setPid(resultSet.getInt(1));
			p.setPname(resultSet.getString(2));
			p.setPrice(resultSet.getInt(3));
			p.setQuantity(resultSet.getInt(4));
			products.add(p);
		}
		System.out.println(products);
		
	}

}
