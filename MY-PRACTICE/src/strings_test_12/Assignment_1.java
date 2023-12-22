package strings_test_12;

public class Assignment_1 {

	public static void main(String[] args) 
	{
		String word ="knowledge";
		for(char ch='a';ch<='z';ch++)
		{
			int count = 0;
			for(int i=0;i<word.length();i++)
			{
				if(word.charAt(i)==ch)
				{
					count++;
					
				}
			}
			if(count>0)
			{
				System.out.println(ch+"--->"+count);
			}
		}
	}

}
