package strings_test_13;

public class OccurenceOfCharacters_219 {

	public static void main(String[] args) 
	{
		String text="ABCDEGHIJKJAMOCHASOFTWAREBAGALORE";
		for(char ch='A';ch<='Z';ch++)
		{
			int count=0;
			for(int i=0;i<text.length();i++)
			{
				if(text.charAt(i)==ch)
				{
					count++;
				}
			}
			if((count>1)&&(ch=='A' || ch=='C' || ch=='O' ||ch=='H' ))
			{
				System.out.println(ch+" --> "+count);
			}
		}

	}

}
