package strings_test_13;

public class NonRepeatedCharactersInString_222 {

	
		public static void main(String[] args) 
		{
			String str="CJSS TECNOLOGIES IS AWESOME";
			System.out.println(str);
			
			String[] str2=str.split(" ");
			for(String word : str2)
			{
				for(int i=0;i<word.length();i++)
				{
					char ch=word.charAt(i);
					if(word.indexOf(ch)==i)
					{
						System.out.print(ch);
					}
				}
				System.out.print(" ");
			}
			
		}
	}


