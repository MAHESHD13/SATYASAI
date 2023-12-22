package strings_test_13;

public class AnagramWordsInString_215 {

	public static void main(String[] args)
	{
		String str="listen java  demo in silent  mode";
		String[] words=str.split(" ");
		for(int i=0;i<words.length-1;i++)
		{
			String s1=words[i];
			int length1=s1.length();
			for(int j=i+1;j<words.length;j++)
			{
				String s2=words[j];
				int length2=s2.length();
				int count=0;
				if(length1==length2)
				{
					for(int k=0;k<s1.length();k++)
					{
						for(int l=0;l<s2.length();l++)
						{
							if(s1.charAt(k)==s2.charAt(l))
							{
								count++;
								break;
							}
						}
					}
					if(count==length1)
					{
						System.out.print(s1+" "+s2+" ");
					}
					
				}
			}
		}
		

	}

}
