package strings_test_13;

public class NumberOfWordsInString_220 {

	public static void main(String[] args)
	{
		String str="This this is is done by Saket Saket";
		String[] words =str.split(" ");
		for(String word : words)
		{
			int count=0;
			for(int i=0;i<words.length;i++)
			{
				if(word.equals(words[i]))
				{
					count++;
				}
				
			}
			System.out.println(word+" "+count);
		}
		
	}

}
