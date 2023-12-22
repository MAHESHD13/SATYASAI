package strings_test_13;

public class PermitationInString_225 {

	public static void main(String[] args) 
	{
		String s1="SathyaTechnologies";
		long fact=1;
		int length=s1.length();
		for(int i=1;i<=length;i++)
		{
			fact=fact*i;
		}
		System.out.println("PERMITATIONS IN STRING : "+fact);
	}

}
