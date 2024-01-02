package com.mahesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mahesh")
public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(App.class);
		CustomerBean customerBean1 = (CustomerBean)applicationContext.getBean("id1");
		EmployeeBean employeeBean1 = (EmployeeBean)applicationContext.getBean("id2");
		EmployeeBean employeeBean2 = (EmployeeBean)applicationContext.getBean("id2");
		employeeBean1.printEmployee();
		System.out.println("ADDRESS OF BEAN1 : "+employeeBean1);
		System.out.println("ADDRESS OF BEAN2 : "+employeeBean2);
	}

}
