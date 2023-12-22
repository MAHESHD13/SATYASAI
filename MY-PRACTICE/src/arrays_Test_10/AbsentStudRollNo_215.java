package arrays_Test_10;

public class AbsentStudRollNo_215 
{
	public static void main(String[] args) 
	{
		int[] rollnumbers= new int[5];
		rollnumbers[0]=110;
		rollnumbers[1]=111;
		rollnumbers[2]=112;
		rollnumbers[3]=113;
		rollnumbers[4]=114;
		for(int i=1;i<rollnumbers.length-1;i++)
		{
			System.out.print(rollnumbers[i]+" ");
		}
	}
}
