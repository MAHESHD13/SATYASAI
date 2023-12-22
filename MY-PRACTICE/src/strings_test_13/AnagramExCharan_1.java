package strings_test_13;

public class AnagramExCharan_1 
{
	public static void main(String[] args)
	{
		String s1="keep";
		String s2="peek";
		int l1=s1.length();
		int l2=s2.length();
		int count=0;
		if(l1==l2)
		{
			for(int i=0;i<l1;i++)
			{
				char ch=s1.charAt(i);
				for(int j=0;j<l2;j++)
				{
					if(ch==s2.charAt(j))
					{
						count++;
						
					}
				}
			}
			System.out.println(count);
			if(count==l1)
			{
				System.out.println("ANAGRAM");
			}
			else
			{
				System.out.println("NOT A ANAGRAM");
			}
		}
	}

}
