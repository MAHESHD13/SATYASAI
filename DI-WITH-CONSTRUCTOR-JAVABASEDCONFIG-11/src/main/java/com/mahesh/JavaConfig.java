package com.mahesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig 
{
	@Bean("obj")
	public ProductBean getProducts()
	{
		Model m1 = new Model(10,"DELL12",9000.00D,"DELL");
		Model m2 = new Model(11,"DELL13",6000.00D,"DELL");
		Model m3 = new Model(12,"DELL14",3000.00D,"DELL");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ID , NAME AND MODELOBJECT VALUES : ");
		int prodId = sc.nextInt();
		String prodName =sc.next();
		Map<String,Integer> myMap = new HashMap();
		myMap.put("DELL", 20);
		myMap.put("LENOVO", 80);
		myMap.put("LG",10);
		List<Model> modelObj = new ArrayList();
		modelObj.add(m1);
		modelObj.add(m2);
		modelObj.add(m3);
		ProductBean productBean = new ProductBean(prodId,prodName,myMap,modelObj);
		return productBean;
				
	}
	

}
