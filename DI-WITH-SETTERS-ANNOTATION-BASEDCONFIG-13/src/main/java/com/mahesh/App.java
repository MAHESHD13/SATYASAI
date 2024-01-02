package com.mahesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spconfig.xml");
		UserBean userBean=(UserBean)applicationContext.getBean("id3");
		
		//CALLING THE CREATE USERS TABLE LOGICS
		//userBean.createTable();
		
		//INSERTING THE DATA INTO USERS TABLE
		//userBean.insertRecord();
		
		//GET ONE USER RECORD 
		//userBean.getUser();
		
		//GET ALL USER RECORDS
		//userBean.getAllUser();
		
		//UPDATE THE RECORD DATA
		//userBean.updateRecord();
		
		//DELETE THE RECORD DATA
		userBean.deleteRecord();
	}
}
