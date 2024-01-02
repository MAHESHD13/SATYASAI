package com.mahesh;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class MobileBean 
{
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt)
	{
		this.jt=jt;
	}
	//creating the table 
	public void createTable()
	{
		jt.execute("create table mobile(modelNo varchar2(30),modelName varchar2(40),companyName varchar2(40),price number ,ramSize varchar2(25),osName varchar2(30),processorName varchar2(40),frontCamSize varchar2(30),backCamSize varchar2(30),imiNo varchar2(50))");
		System.out.println("MOBILE TABLE CREATED SUCCESSFULLY.........");
	}
	//insert the records into table
	public void insertRecord()
	{
		int i = jt.update("insert into mobile values('IA154','APPLE-11','APPLE',74116,'16GB','IOS','14th version','32.5px','50.px','#196760445868')");
		System.out.println("DATA INSERTED SUCCESSFULLY....."+i);
	}
	//update the record 
	public void updateRecord()
	{
		int i = jt.update("update mobile set modelName='OPPO-18',companyName='OPPO' where modelNo='IA012'");
		System.out.println("RECORD UPDATED SUCCESSFULLY...."+i);
		
	}
	//delete the record
	public void deleteRecord()
	{
		int i = jt.update("delete from mobile where modelNo='IA012'");
		System.out.println("RECORD DELETED SUCCESSFULLY......"+i);
	}
	//get one record
	public void getMobile()
	{
		List l = jt.queryForList("select * from mobile where modelNo='IA012'");
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			Object o=it.next();
			System.out.println(o.toString());
		}
	}
	//get All records
		public void getAllMobile()
		{
			List l = jt.queryForList("select * from mobile");
			Iterator it = l.iterator();
			while(it.hasNext())
			{
				Object o=it.next();
				System.out.println(o.toString());
			}
		}
}
