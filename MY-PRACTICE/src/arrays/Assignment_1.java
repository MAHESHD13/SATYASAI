package arrays;

public class Assignment_1 
{
	public static void main(String[] args) 
	{
		String str ="java by ratan";
		String[] str1= str.split(" ");
		for(String s:str1)
		{
			char[] c=s.toCharArray();
			int l=0,r=c.length-1;
			while(l<r)
			{
				char temp =c[l];
				c[l]=c[r];
				c[r]=temp;
				l++;
				r--;
			}
			for(char c1:c)
			{
				System.out.print(c1);
			}
			System.out.print(" ");
		}
		
	}

}
