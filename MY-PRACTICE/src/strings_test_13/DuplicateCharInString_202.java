package strings_test_13;

public class DuplicateCharInString_202 
{
	public static void main(String[] args) 
	{
		String str="$@thyatecH@25Year$!";
		char ch='@';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
			{
				count++;
			}
		}
		if(count>1)
		{
			System.out.println("DUPLICATE CHARACTER : "+ch);
		}
	}

}
