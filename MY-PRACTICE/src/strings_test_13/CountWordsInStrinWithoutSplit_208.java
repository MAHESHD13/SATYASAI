package strings_test_13;

public class CountWordsInStrinWithoutSplit_208{

	public static void main(String[] args)
	{
		String s="this is java exam code";
		int count=1;
		char target=' ';
		int index=s.indexOf(target);
		while(index>=0)
		{
			count++;
			index=s.indexOf(target,index+1);
		}
		System.out.println("NUMBER OF WORDS IN "+s+" = "+count);
	}

}
