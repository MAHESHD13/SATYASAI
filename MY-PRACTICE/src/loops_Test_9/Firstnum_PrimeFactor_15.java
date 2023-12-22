package loops_Test_9;

public class Firstnum_PrimeFactor_15 
{
	public static void main(String[] args) 
	{
		int n=28;
		int temp = 0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				temp=i;
			}
		}
		System.out.println(temp);
	}

}
