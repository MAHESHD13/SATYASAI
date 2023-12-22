package strings_test_13;

public class AnagromExample_212 {

	public static void main(String[] args) 
	{
		String s1="Peek";
		String s2="Keep";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int count=0;
		int length1=s1.length();
		int length2=s2.length();
		if(length1==length2)
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						count++;
						break;
					}
				}
			}
			if(count==length1)
			{
				System.out.println(s1+" IS "+" : "+"ANAGROM");
			}
			else
			{
				System.out.println(s1+" IS NOT A "+" : "+"ANAGROM");			
					
			}
		}
		else
		{
			System.out.println("LENGTH IS NOT EQUAL AND NOT A ANAGROM");			
		}
		
		
	}

}
