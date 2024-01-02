package com.mahesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
		ProductBean pp=(ProductBean)ctx.getBean("id1");
		pp.printProducts();
		
	}

}
