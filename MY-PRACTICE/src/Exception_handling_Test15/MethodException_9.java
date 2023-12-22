package Exception_handling_Test15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodException_9
{
	public static void numberValidate(int number1,int number2)
	{
		try
		{
			int number = number1 / number2;
			System.out.println("RESULT......"+number);
		}
		catch(ArithmeticException e)
		{
			System.out.println("GIVEN ZERO CHECK ONCE....");
		}
	}
		
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number 1.....");
		try
		{
			int num1 =s.nextInt();
			System.out.println("Enter a number 2.....");
		    int num2 = s.nextInt();
			MethodException_9.numberValidate(num1, num2);
		}
		catch(InputMismatchException e)
		{
			System.out.println("ENTER VALID INT DATA.....");
		}
		//MethodException_9.numberValidate(num1, num2);
		
	}

}
