package com.mahesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductBean productBean = (ProductBean)applicationContext.getBean("obj");
		productBean.printProducts();
	}

}
