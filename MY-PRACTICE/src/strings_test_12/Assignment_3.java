package strings_test_12;

public class Assignment_3 {

	public static void main(String[] args) 
	{
		String s="He is Ambidextrous";
		String[] str1=s.split(" ");
		for(String word:str1)
		{
			String target=word;
			int index=word.indexOf(target);
			System.out.println(word.charAt(index)+"--->"+index);
			int index1=index+target.length()-1;
			System.out.println(word.charAt(index1)+"--->"+index1);
			
		}
	}

}
