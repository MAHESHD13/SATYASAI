package strings_test_13;

public class ReverseEveryWord_209 {

	public static void main(String[] args)
	{
		String s="i like coding in java";
		String[] str1=s.split(" ");
		for(String str2 : str1)
		{
			for(int i=str2.length()-1;i>=0;i--)
			{
				System.out.print(str2.charAt(i));
			}
			System.out.print(" ");
		}
	}

}
