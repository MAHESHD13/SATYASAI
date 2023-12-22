package arrays_Test_10;

public class VowelCharacters_23 {

	public static void main(String[] args)
	{
		char[] ch = {'a','b','c','d','e'};
		/*for(char c :ch)
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.print(c+" ");
				
			}
		}
		*/
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.print(ch[i]+" ");
				
			}
		}
	}

}
