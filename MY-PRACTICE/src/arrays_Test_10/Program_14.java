package arrays_Test_10;

public class Program_14
{
	public static void main(String[] args)
	{
		boolean[] b= {true,false,false,true,true,false,true};
		for(int i=0;i<b.length;i++)
		{
			if(b[i])
			{
				System.out.print(i+" ");
			}
		}
	}

}
