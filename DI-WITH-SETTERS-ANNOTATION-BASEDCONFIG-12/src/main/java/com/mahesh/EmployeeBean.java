package com.mahesh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("id2")
@Scope("prototype")
public class EmployeeBean 
{
	private int empId;
	private String empName;
	
	//PDC
	public EmployeeBean()
	{
		System.out.println("THIS IS A EMPLOYEE BEAN");
	}

	public int getEmpId() {
		return empId;
	}
	@Value("120")
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}
	@Value("Sathya Tech")
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	//BUSSINESS METHODS
	public void printEmployee()
	{
		System.out.println("EMPLOYEE ID : "+empId);
		System.out.println("EMPLOYEE NAME : "+empName);
	}
}
