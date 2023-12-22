package arrays_Test_10;

public class BinaryNumber_220 
{
    public static void main(String[] args) 
    {
    	int[] numbers= {11,2,3,5,153,121,145,28,6,3,5,11};
		for(int i=0;i<numbers.length;i++)
		{
			int base =1,binary=0,decimal=0;
			while(numbers[i] != 0)
			{
				int rem =numbers[i] % 2;
				decimal= decimal +(rem * base);
				base =base*10;
				numbers[i]= numbers[i]/2;
			}
			System.out.print(decimal+" ");
		}
        
    }
}

