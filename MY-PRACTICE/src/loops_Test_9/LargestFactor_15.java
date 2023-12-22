package loops_Test_9;

import java.util.Scanner;

public class LargestFactor_15 
{

	public static void main(String[] args)
	{
		int temp=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = s.nextInt();
		for(int i=1;i <num;i++)
		{
			if(num % i ==0)
			{
				temp = i;
			}
		}
		System.out.println("Largest Factor Except that number "+temp);
		

	}

}
