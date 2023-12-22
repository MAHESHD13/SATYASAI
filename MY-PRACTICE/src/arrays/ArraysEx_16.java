package arrays;

import java.util.Scanner;

public class ArraysEx_16 {

	public static void main(String[] args) 
	{
		//CREATE THE SCANNER OBJECT
		Scanner s = new Scanner(System.in);
		//ENTER THE SIZE OF AN ARRAY
		System.out.println("Enter the size of an array...");
		int size = s.nextInt();
		//CRETE THE ARRAY
		String[] names = new String[size];
		//READING ALL THE NAMES FROM ENDUSER
		for(int i =0 ;i<names.length;i++)
		{
			System.out.println("Enter "+i+" index name...");
			names[i] = s.next();
		}
		for(String name : names)
		{
			System.out.print(name+" ");
		}
		System.out.println("Enter the element to check whether the search element is present or not.....");
		String names1 = s.next();
		boolean flag = false;
		for(String name : names)
		{
			if(name.equalsIgnoreCase(names1))
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Element is present..."+names1);
		}
		else
		{
			System.out.println("Element is not present..."+names1);
		}
		//RELEASING THE SCANNER OBJECT
		s.close();
	}

}
