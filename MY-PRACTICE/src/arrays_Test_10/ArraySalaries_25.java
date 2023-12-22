package arrays_Test_10;

public class ArraySalaries_25 {

	public static void main(String[] args)
	{
		int[] salaries = {10000,120000,150000,75000,90000};
		/*for(int sal :salaries)
		{
			if(sal > 100000)
			{
				System.out.print(sal+" ");
			}
		}
		 */
		for(int i=0;i<salaries.length;i++)
		{
			if(salaries[i] > 100000)
			{
				System.out.print(salaries[i]+" ");
			}
		}
	}

}
