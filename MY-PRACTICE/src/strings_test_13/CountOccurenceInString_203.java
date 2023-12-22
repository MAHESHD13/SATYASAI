package strings_test_13;

public class CountOccurenceInString_203 
{
	public static void main(String[] args) 
	{
		String str=new String("aaaBBcd");
		for(char ch='a';ch<='z';ch++)
		{
			int count=0;
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==ch)
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(ch+"----->"+count);
			}
		}
			for(char ch1='A';ch1<='Z';ch1++)
			{
				int count1=0;
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i)==ch1)
					{
						count1++;
					}
				}
				if(count1>0)
				{
					System.out.println(ch1+"----->"+count1);
				}
			
		}
	}

}