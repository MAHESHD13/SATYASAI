package com.mahesh;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig 
{
	@Bean("obj")
	public Product getProduct()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER MARGIN ID AND MARGIN CODE : ");
		int mrgId = sc.nextInt();
		String mrgCode = sc.next();
		Margin margin=new Margin(mrgId,mrgCode);
		
		System.out.println("ENTER MODEL ID , MODEL CODE AND MODEL COST : ");
		int modelId = sc.nextInt();
		String modelCode = sc.next();
		double modelCost = sc.nextDouble();
		Model model = new Model(modelId,modelCode,modelCost,margin);
		
		System.out.println("ENTER PRODUCT ID AND PRODUCT NAME : ");
		int prodId = sc.nextInt();
		String prodName = sc.next();
		Product product = new Product(prodId,prodName,model);
		return product;
	}

}
