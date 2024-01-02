package com.mahesh;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import oracle.net.aso.e;

public class UserBean 
{
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt)
	{
		this.jt=jt;
	}
	public void createTable()
	{
		jt.execute("create table users(user_id number(38),name varchar2(40),email varchar2(40))");
		System.out.println("NEW USER TABLE CREATED.....");
	}
	public void insertRecord()
	{
		int i = jt.update("insert into users values(103,'mahesh','mahesh@gmail.com')");
		System.out.println("NEW RECORD INSERTED SUCCESSFULLY.....");
	}
	//GET ONE USER RECORD
	public void getUser()
	{
		List l=jt.queryForList("select * from users where user_id=101");
		Iterator<e> it = l.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o.toString());
		}
	}
	//GET ALL USER RECORD
	public void getAllUser()
	{
		List l=jt.queryForList("select * from users");
		Iterator<e> it = l.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			System.out.println(o.toString());
		}
	}
	public void updateRecord()
	{
		int i = jt.update("update users set name='sony',email='sony@gmail.com' where user_id=103");
		System.out.println("RECORD UPDATED SUCCESSFULLY.....");
	}
	public void deleteRecord()
	{
		int i = jt.update("delete from users where user_id='103'");
		System.out.println("RECORD DELETED SUCCESSFULLY.....");
	}
}
