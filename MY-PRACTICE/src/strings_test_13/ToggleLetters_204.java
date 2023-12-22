package strings_test_13;

public class ToggleLetters_204 {

	public static void main(String[] args) 
	{
		String s="ApPlE";
		System.out.println("GIVEN STRING = "+s);
		String ch1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isLowerCase(ch))
			{
				ch=s.toUpperCase().charAt(i);
				ch1=ch1+ch;
			}
			else
			{
				ch=s.toLowerCase().charAt(i);
				ch1=ch1+ch;
			}
		}
		System.out.println("RESULTANT TOGGLE STRING = "+ch1);
	}

}
