package loops_Test_9;

import java.util.Scanner;

public class PrimNumCheckAndStrongAndPerfectNumcheck_10 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("ENTER A NUMBER TO CHECK NUMBER IS PRIME , IF PRIME CHECK NUMBER IS PERFECT NUMBER OTHERWISE CHECK THE NUMBER IS STRONG NUMBER.... ");
		int num=s.nextInt();
		
		int n1=num;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.print("NOT A PRIME NUMBER ");
			
				int sum=0;
				while(num!=0)
				{
					int digit=num%10;
					int mul=1;
					for(int j=1;j<=digit;j++)
					{
						mul *= j;
					}
					sum += mul;
					num /= 10;
				}
				
				if(sum==n1)
				{
					System.out.println("BUT IT IS A STRONG NUMBER ");
				}
				else
				{
					System.out.println("BUT IT IS NOT A STRONG NUMBER ");
				}
			}
		else
			{
				int sum1=0;
				System.out.print("PRIME NUMBER ");
				for(int k=1;k<n1;k++)
				{
					if(n1%k==0)
					{
						sum1 += k;
					}
				}
				if(n1==sum1)
				{
					System.out.println("BUT IT IS A PERFECT NUMBER");
				}
				else
				{
					System.out.println("BUT IT IS NOT A PERFECT NUMBER ");
				}
			}
			
		}
		
	}

}
