package com.mahesh;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*//USING STATIC DATA
@Configuration
public class ProductConfig 
{
	@Bean("id1")
	public ProductBean getProduct()
	{
		ProductBean productBean=new ProductBean(101,"LENOVO",45000.00d,2);
		return productBean;
	}
}
*/
//USING DYNAMIC DATA
@Configuration
public class ProductConfig
{
	@Bean("id1")
	public ProductBean getProduct()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER PRODUCT ID  , PRODUCT NAME , PRICE AND QUANTITY ");
		int pId = sc.nextInt();
		String pName = sc.next();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		
		ProductBean productBean = new ProductBean(pId,pName,price,quantity);
		return productBean;
	}
}
