package collectionsframework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_03 {

	public static void main(String[] args) 
	{
		Set<Employee_03> employees=new LinkedHashSet<Employee_03>();
		Employee_03 employee1 =new Employee_03();
		employee1.setEmpId(101);
		employee1.setEmpName("John");
		employee1.setEmpSalary(30000);
		employee1.setEmpDeptNum(20);
		employee1.setEmpLocation("Hyderabad");
		
		Employee_03 employee2 =new Employee_03();
		employee2.setEmpId(102);
		employee2.setEmpName("Ratan");
		employee2.setEmpSalary(35000);
		employee2.setEmpDeptNum(10);
		employee2.setEmpLocation("Chennai");
		
		Employee_03 employee3 =new Employee_03();
		employee3.setEmpId(103);
		employee3.setEmpName("Alex");
		employee3.setEmpSalary(40000);
		employee3.setEmpDeptNum(20);
		employee3.setEmpLocation("Bangalore");
		
		Employee_03 employee4 =new Employee_03();
		employee4.setEmpId(104);
		employee4.setEmpName("Peter");
		employee4.setEmpSalary(45000);
		employee4.setEmpDeptNum(20);
		employee4.setEmpLocation("Hyderabad");
		
		Employee_03 employee5 =new Employee_03();
		employee5.setEmpId(105);
		employee5.setEmpName("Bensil");
		employee5.setEmpSalary(50000);
		employee5.setEmpDeptNum(10);
		employee5.setEmpLocation("Bangalore");
		
		Employee_03 employee6 =new Employee_03();
		employee6.setEmpId(106);
		employee6.setEmpName("Ginger");
		employee6.setEmpSalary(35000);
		employee6.setEmpDeptNum(20);
		employee6.setEmpLocation("Hyderabad");
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		
		//display all records
		System.out.println(employees);
		System.out.println("*****************************");
		
		//display details of employee whose id is 105
		for(Employee_03 emp : employees)
		{
			if(emp.getEmpId()==105)
			{
				System.out.println(emp);
			}
		}
		System.out.println("*****************************");
		
		//display employee details those who are belongs to deptnumber=20
		for(Employee_03 emp : employees)
		{
			if(emp.getEmpDeptNum()==20)
			{
				System.out.println(emp);
			}
		}
		System.out.println("*****************************");
		
		//diplay employee details those who are not staying in hyderabad
		for(Employee_03 emp : employees)
		{
			if(emp.getEmpLocation()!="Hyderabad")
			{
				System.out.println(emp);
			}
		}
		System.out.println("*****************************");
		
		//display employee details whose salary in between 40000 to 50000
		for(Employee_03 emp : employees)
		{
			if(emp.getEmpSalary()>=40000 && emp.getEmpSalary()<=45000)
			{
				System.out.println(emp);
			}
		}
		System.out.println("*****************************");
		
		//display employee details belongs to hyderabad and whose salary is >40000
		for(Employee_03 emp : employees)
		{
			if(emp.getEmpLocation()=="Hyderabad" && emp.getEmpSalary()>40000)
			{
				System.out.println(emp);
			}
		}
		System.out.println("*****************************");
		
		for(Employee_03 emp : employees)
		{
			if(emp.getEmpId()==102 || emp.getEmpId()==105)
			{
				System.out.println(emp);
			}
		}
		System.out.println("*****************************");
		
		for(Employee_03 emp : employees)
		{
			if(emp.getEmpLocation()=="Hyderabad" || emp.getEmpLocation()=="Bangalore" &&emp.getEmpDeptNum()==20 )
			{
				System.out.println(emp);
			}
		}
		System.out.println("*****************************");
		
	}

}
