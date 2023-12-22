package strings_test_13;

public class CountOfWordsInString_207 {

	public static void main(String[] args) 
	{
		String str="this is java exam code";
		String[] str1=str.split(" ");
		for(String str2 : str1)
		{
			int count=0;
			for(int i=0;i<str2.length();i++)
			{
				count++;
			}
			System.out.println(str2+"----->"+count);
		}
	}

}
