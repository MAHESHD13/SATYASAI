package strings_test_13;

public class FirstCharacterInString_206 
{
	public static void main(String[] args) 
	{
		String str="this is java exam code";
		String[] str1=str.split(" ");
		for(String str2:str1)
		{
			System.out.println(str2.charAt(0));
		}
	}

}
