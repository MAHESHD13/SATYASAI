package loops_Test_9;

public class Patterns11
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
