package com.sathya;

import java.util.List;
import java.util.Map;

public class Employee 
{
	private int empId;
	List<Integer> empProjects;
	Map<Integer,String> empMap;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public void printEmpId()
	{
		System.out.println("Employee Id :"+empId);
	}
	public void printEmpProjects()
	{
//		for(Integer empProject:empProjects)
//		{
//			System.out.println("List Of Projects:"+empProject);
//		}
		System.out.print("List of Projects :");
		empProjects.forEach(p->System.out.print(p+" "));
		System.out.println();
	}
	public void printEmpMap()
	{
		System.out.print("Number Of Projects With Company Name : ");
		for(Map.Entry<Integer,String> entry:empMap.entrySet())
		{
				System.out.print(entry.getKey()+"--->"+entry.getValue()+" ");
		}
	}
}
