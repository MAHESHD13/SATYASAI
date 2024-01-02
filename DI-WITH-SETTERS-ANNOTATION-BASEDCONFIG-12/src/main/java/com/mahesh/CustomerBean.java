package com.mahesh;

import org.springframework.stereotype.Component;

@Component("id1")
public class CustomerBean 
{
	//PDC	
	public CustomerBean() 
	{
		System.out.println("THIS IS A CUSTOMER BEANS");
	}
}
