package Exception_handling_Test15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberFormatAndInputMismatchException_2
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age....");
		try
		{
			int age1 = s.nextInt();
			System.out.println("Youur Age is : "+age1);
			System.out.println("Enter New age : ");
			String age = s.next();
			System.out.println("Your Second age is : "+age);
			int num = Integer.parseInt(age);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter valid int data....."+e);
		}
	    catch(InputMismatchException e)
		{
	    	System.out.println("ENTER VALID DATA....."+e);
		}
		finally
		{
			s.close();
			System.out.println("CLOSING THE RESOURCES AND APPLICATION IS COMPLETED.....");
		}

	}

}
