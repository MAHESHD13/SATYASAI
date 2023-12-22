package strings_test_13;

public class HighestLengthWordInString_213 {

	public static void main(String[] args)
	{	
		int index=0;
		String str="Everyone should be perfecteveryone in Coding";
		String[] str3=str.split(" ");
		for(int i=0;i<str3.length;i++)
		{
			for(int j=i+1;j<str3.length;j++)
			{
				if(str3[i].length()>str3[j].length())
				{
					index=i;
				}
			}
		}
		System.out.println(str3[index]);
		}

}
