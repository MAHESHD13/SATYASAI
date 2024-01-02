package com.mahesh;

import java.util.List;
import java.util.Map;

public class Employee 
{
	private int empId;
	private List<Integer> empProjects;
	private Map<Integer,String> empMap;

	//PDC
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
/*
	//PPC
	
	public Employee(int empId, List<Integer> empProjects, Map<Integer, String> empMap) {
		super();
		this.empId = empId;
		this.empProjects = empProjects;
		this.empMap = empMap;
	}
*/
	
	//BUSINESS METHODS
	public void printEmployee()
	{
		System.out.println("Employee Id : "+empId);
		System.out.println("List Of projects : "+empProjects);
		System.out.println("Number Of Projets With CompanyName : "+empMap);
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public List<Integer> getEmpProjects() {
		return empProjects;
	}

	public void setEmpProjects(List<Integer> empProjects) {
		this.empProjects = empProjects;
	}

	public Map<Integer, String> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<Integer, String> empMap) {
		this.empMap = empMap;
	}
	

}
