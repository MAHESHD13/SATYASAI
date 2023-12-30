package com.mahesh.accessmodifiers;

public class Employee1 extends Employee1a
{
	private String dep="DEVELOPMENT";
    public void display()
    {
    	System.out.println("EMPPLOYEE ID : "+id);
    	System.out.println("EMPLOYEE NAME : "+name);
    	System.out.println("EMPLOYEE DEPARTMENT : "+dep);
    	
    }
	public static void main(String[] args)
	{
		Employee1 emp=new Employee1();
		emp.display();
		
	}

}
