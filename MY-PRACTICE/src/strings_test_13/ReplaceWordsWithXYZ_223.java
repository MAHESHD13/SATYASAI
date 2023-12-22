package strings_test_13;

public class ReplaceWordsWithXYZ_223 {

	public static void main(String[] args) 
	{
		String str="yahoo!mail spamguard helps keep junk email out of your life";
		System.out.println(str);
		str=str.replaceAll("mail", "xyz");
		System.out.println(str);
	}

}
