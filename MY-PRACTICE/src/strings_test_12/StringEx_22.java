package strings_test_12;

public class StringEx_22 
{

	public static void main(String[] args) 
	{
		String str ="Sathy@Tech@25year$!";
		System.out.println("GIVEN STRING = "+str);
		System.out.println();
		
		//1.Length of Given String
		System.out.println("LENGTH OF GIVEN STRING = "+str.length());
		System.out.println();
		
		//Display first character of given String
		System.out.println("FIRST CHARACTERR OF STRING = "+str.charAt(0));
		System.out.println();
		
		//Display Last Character of Given String
		System.out.println("LAST CHARACTER OF GIVEN STRING = "+str.charAt(str.length()-1));
		System.out.println();
		
		//Display The UNICODE value of First Character
		System.out.println("UNICODE VALUE OF FIRST CHARACTER = "+(int)str.charAt(0));
		System.out.println();
		
		//Check the first character is vowel or not
		String s1=str.toLowerCase();
		char ch=s1.charAt(0);
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+" IS VOWEL...");
		}
		else
		{
			System.out.println(ch+" IS NOT A VOWEL...");
		}
		System.out.println();
		
		//Check the Last character is alphabet or not
		char lch=str.charAt(str.length()-1);
		if(lch>='a'&&lch<='z' || lch>='A'&& lch<='Z')
		{
			System.out.println(lch+" IS AN ALPHABET...");
		}
		else
		{
			System.out.println(lch+" IS NOT AN ALPHABET...");
		}
		System.out.println();
		
		//Convert First character to lower case
		String s2=str.toLowerCase();
		char ch2=s2.charAt(0);
		System.out.println("LOWER CASE OF FIRST CHARACTER = "+ch2);
		System.out.println();
		
		//Convert lower case to upper case
		String s3=str.toUpperCase();
		System.out.println("STRING IN UPPER CASE = "+s3);
		System.out.println();
		
		//Convert upper case to lower case
		String s4=s3.toLowerCase();
		System.out.println("STRING IN LOWER CASE = "+s4);
		}
	

}
