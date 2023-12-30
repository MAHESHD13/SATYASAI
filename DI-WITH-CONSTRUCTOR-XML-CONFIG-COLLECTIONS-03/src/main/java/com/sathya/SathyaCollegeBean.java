package com.sathya;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class SathyaCollegeBean 
{
	private List<String> studentNames;
	private Set<Integer> studentRollNos;
	private Map<String,Integer> branchDetails;
	private Properties branchInfos;
	public SathyaCollegeBean() {
		super();
	}
	public List<String> getStudentNames() {
		return studentNames;
	}
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
	public Set<Integer> getStudentRollNos() {
		return studentRollNos;
	}
	public void setStudentRollNos(Set<Integer> studentRollNos) {
		this.studentRollNos = studentRollNos;
	}
	public Map<String, Integer> getBranchDetails() {
		return branchDetails;
	}
	public void setBranchDetails(Map<String, Integer> branchDetails) {
		this.branchDetails = branchDetails;
	}
	public Properties getBranchInfos() {
		return branchInfos;
	}
	public void setBranchInfos(Properties branchInfos) {
		this.branchInfos = branchInfos;
	}
	
	public void printStudentNames()
	{
		System.out.println("========STUDENT NAMES INFORMATION=========");
		for(String studentName:studentNames)
		{
			if(studentName.startsWith("T"))
			{
				System.out.println(studentName);
			}
		}
	}
	public void printStudentRollNos()
	{
		System.out.println("========STUDENT ROLLNUMBERS INFORMATION=========");
		for(Integer studentRollNo:studentRollNos)
		{
			System.out.println(studentRollNo);
		}
	}
	public void branchDetails()
	{
		System.out.println("========BRANCH DETAILS=========");
		for(Entry<String, Integer> entry:branchDetails.entrySet())
		{
			System.out.println(entry.getKey()+"---->"+entry.getValue());
		}
	}
	public void printBranchInfo()
	{
		System.out.println("========BRANCH INFORMATION=========");
		Set<String> keys = branchInfos.stringPropertyNames();
		for(String key : keys)
		{
			System.out.println(key+"--->"+branchInfos.getProperty(key));
		}
	}

}
