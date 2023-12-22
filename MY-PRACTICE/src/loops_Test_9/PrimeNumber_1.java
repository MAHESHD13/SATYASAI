package loops_Test_9;

public class PrimeNumber_1
{
	public static void main(String[] args) 
	{
		
		for(int i=2;i<=100;i++)
		{
			int fact = 0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					fact++;
					break;
				}
			}
			if(fact==0)
			{
				System.out.println(i);
			}
		}
	}
		
}


