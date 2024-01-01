package com.sathya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private int empId;
    private String empName;
    private double salary;

    @Autowired
    @Qualifier("permanentAddress")
    private AddressBean addr;

    // PUBLIC DEFAULT CONSTRUCTOR

    public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
    

    public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public AddressBean getAddr() {
		return addr;
	}


	public void setAddr(AddressBean addr) {
		this.addr = addr;
	}


	// BUSINESS METHODS
    public void printEmployee() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Address: " + addr);
    }

}
