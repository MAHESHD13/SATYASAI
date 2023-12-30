package com.mahesh.exceptionhandling;
import java.util.*;
public class StudentDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STUDENT ROLL NUMBER : ");
		int rollno=sc.nextInt();
		System.out.println("ENTER THE STUDENT NAME : ");
		String name=sc.next();
		System.out.println("ENTER THE STUDENT AGE : ");
		int age=sc.nextInt();
		System.out.println("ENTER THE COURSE : ");
		String course=sc.next();
		Student s=new Student(rollno,name,age,course);
		s.display();
		

	}

}
