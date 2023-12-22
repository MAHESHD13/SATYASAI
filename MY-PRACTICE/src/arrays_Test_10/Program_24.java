package arrays_Test_10;

public class Program_24 {

	public static void main(String[] args) 
	{
		boolean[] b = {true,false,false,true,false};
		/*for(boolean b1:b)
		{
			if(b1==false)
			{
				System.out.println(b1);
			}
		}
		*/
		for(int i =0;i<b.length;i++)
		{
			if(!b[i])
			{
				System.out.println(b[i]);
			}
		}
	}

}
