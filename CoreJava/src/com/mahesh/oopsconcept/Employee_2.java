package com.mahesh.oopsconcept;

public class Employee_2
{

	public static void main(String[] args)
	{
		EmpSetGet_2a emp=new EmpSetGet_2a();
		emp.setEmpid(2151013);
		emp.setEmpname("MAHESH");
		emp.setEmpage(24);
		emp.setEmpdept("CODING");
		System.out.println("EMPLOYEE ID : "+emp.getEmpid()+"\nEMPLOYEE NAME : "+emp.getEmpname()+"\nEMPLOYEE AGE : "+emp.getEmpage()+"\nEMPLOYEE DEPARTMENT : "+emp.getEmpdept());
		

	}

}
