package com.mahesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee employee = (Employee)applicationContext.getBean("id1");
		employee.printEmployee();
	}

}
