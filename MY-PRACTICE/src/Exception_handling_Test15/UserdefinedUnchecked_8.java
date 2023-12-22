package Exception_handling_Test15;

import java.util.Scanner;

class ChildChotaException extends RuntimeException
{
	
}
class TooYoungException extends RuntimeException
{
	TooYoungException(String msg)
	{
		super(msg);
	}
}
class TooOldException extends RuntimeException
{
	public TooOldException(String msg) 
	{
		super(msg);
	}
}
public class UserdefinedUnchecked_8
{
	public static void validate(int age)
	{
		if(age<10)
		{
			throw new ChildChotaException();
		}
		else if(age >=10 && age<18)
		{
			throw new TooYoungException("YOUR KID NOT ELIGIBLE FOR MARRIGE....");
		}
		else if(age >=18 && age < 30)
		{
			System.out.println("ELIGIBLE FOR MARRIGE ENJOY THE LIFE.....");
		}
		else
		{
			throw new TooOldException("YOU ARE OLD MAN NOT ELIGIBLE FOR MARRIGE.....");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER YOUR AGE....");
		int age = s.nextInt();
		UserdefinedUnchecked_8.validate(age);

	}

}
