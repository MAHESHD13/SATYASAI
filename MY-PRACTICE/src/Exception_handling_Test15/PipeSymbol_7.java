package Exception_handling_Test15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PipeSymbol_7 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER A NUMBER .....");
		try
		{
			int number = 100;
			int number1 = s.nextInt();
			int number3=number / number1;
			System.out.println(number3);
		}
		catch(ArithmeticException  | InputMismatchException e)
		{
			System.out.println("Exception occured due to  arithmetic exception or InputMismatchException ");
		}

	}

}
