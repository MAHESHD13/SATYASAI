package strings_test_13;

public class NumberCheckInString_210 {

	public static void main(String[] args)
	{
		String s="SathyaTech";
		int length=s.length();
		System.out.println(length);
		if(length % 2 == 0)
		{
			int sum=0;
			for(int i=1;i<length;i++)
			{
				if(length % i==0)
				{
					sum=sum+i;
				}
			}
			if(length==sum)
			{
				System.out.println("EVEN AND PERFECT NUMBER....."+length);
			}
			else
			{
				System.out.println("EVEN AND NOT A PERFECT NUMBER....."+length);
			}
			
		}
		else
		{
			boolean isprime=true;
			for(int i=2;i<length;i++)
			{
				if(length % i == 0)
				{
					isprime=false;
					break;
				}	
			}
			if(isprime)
			{
				System.out.println("ODD AND PRIME NUMBER....."+length);
			}
			else
			{
				System.out.println("ODD AND NOT PRIME NUMBER....."+length);
				
			}
			
		}
		
		}
	}


