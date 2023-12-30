package com.mahesh.exceptionhandling;

public class Student
{
	int rollno;
	String name;
	int age;
	String course;
	Student()
	{
		rollno=0;
		name=null;
		age=0;
		course=null;
	}
	Student(int r,String n,int a,String c)
	{
		rollno=r;
	    course=c;
		int i,temp=0;
		int L=n.length();
		for(i=0;i<L;i++)
		{
			char ch;
			ch=n.charAt(i);
			if(ch<'A'||ch>'Z'&&ch<'a'||ch>'z')
				temp=1;
			try
			{
				if(temp==1)
				{
					throw new NameNotValidException();
				}
				else
					name=n;
			}
			catch(NameNotValidException e1)
			{
				System.out.println(e1);
			}	
			try
			{
				if(a>=15&&a<=21)
					age=a;
				else
					throw new AgeNotWithInRangeException();
			}
			catch(AgeNotWithInRangeException e2)
			{
				System.out.println(e2);
				
			}
			
		}
	}
		void display()
		{
			System.out.println("ROLLNO   NAME      AGE      COURSE");
			System.out.println("==================================================================");
			System.out.println(rollno+"  "+name+"      "+age+"     "+course);
		}
	}

