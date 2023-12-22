package Exception_handling_Test15;

import java.util.Scanner;

public class ExceptionExamples_1 
{

	public static void main(String[] args) throws ClassNotFoundException 
	{
		Scanner s=new Scanner(System.in);
		
		/*
		Arithmetic Exception
		System.out.println(10/0);
		*/
		
		/* 
		StringIndexOutOfBoundsException
		String name="mahesh";
		System.out.println(name.charAt(6));
		*/
		
		/*
		 ArrayIndexOutOfBoundsException
		int arr[] = {10,20,30};
		System.out.println(arr[5]);
		*/
		
		/*InputMismatchException
		int sno=s.nextInt();
		System.out.println(sno);
		*/
		
		/*NullPointerException
		 String  name=null;
		 if(name.equals("s"))
		 {
			 System.out.println(name);
		 }
		*/
		
		/*ClassNotFoundException
 
		    Class.forName("com.example.MyClass");  
		*/
		/*OutOfMemoryError*/
		
		/*NoClassDefFoundError*/
		 
		
		/*NumberFormatException*/
        int a = Integer.parseInt("one"); 
       
		
		/*IllegalArgumentException*/
		
		/*NegativeArraySizeException*/
		
		/*ClassCastException*/
		
		/*StackOverflowError*/
	}

}
