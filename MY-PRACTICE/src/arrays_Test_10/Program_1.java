package arrays_Test_10;

public class Program_1 
{
	public static void main(String[] args) 
	{
		int[] rollnumbers =new int[5];
		rollnumbers[0] = 110;
		rollnumbers[1] = 111;
		rollnumbers[2] = 112;
		rollnumbers[3] = 113;
		rollnumbers[4] = 114;
		//int[] rollnumbers = {110,111,112,113,114};
		for(int roll : rollnumbers)
		{
			System.out.print(roll+" ");
		}

	}

}
