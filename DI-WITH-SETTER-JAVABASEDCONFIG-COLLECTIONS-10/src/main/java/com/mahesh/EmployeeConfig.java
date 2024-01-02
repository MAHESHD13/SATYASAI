package com.mahesh;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig 
{
	@Bean("id1")
	public Employee getEmployee()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER EMPLOYEE ID : ");
		int empId = sc.nextInt();
		System.out.println("ENTER LIST OF PROJECTS : ");
		List<Integer> empProjects = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			empProjects.add(sc.nextInt());
		}
		System.out.println("ENTER NUMBER OF PROJECTS WITH COMPANY NAMES : ");
		Map<Integer,String> empMap =new LinkedHashMap<Integer,String>();
		for(int i=0;i<3;i++)
		{
			empMap.put(sc.nextInt(), sc.next());
		}
		/*
		Employee employee = new Employee(empId,empProjects,empMap);
		return employee;
		*/
		Employee employee=new Employee();
		employee.setEmpId(empId);
		employee.setEmpProjects(empProjects);
		employee.setEmpMap(empMap);
		
		return employee;
	}

}
