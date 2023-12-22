package strings_test_13;

public class LengthOfLongestWord_214 
{
	public static void main(String[] args) 
	{
		int index=0;
		String str="madam arora teaches Malayalam and i like Malayalam  language";
		String[] str1=str.split(" ");
		int count=0;
		for(int i=0;i<str1.length;i++)
		{
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i].length()>str1[j].length())
				{
					index=i;
				}
			}
		}
		String word=str1[index];
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i].equals(word))
			{
				count++;
			}
		}
		System.out.println(word+" REPEATED IN "+count+" TIMES");
	}

}
