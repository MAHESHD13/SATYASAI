package strings_test_13;

public class RemoveDuplicateSpaceInString_216 {

	public static void main(String[] args) 
	{
		String str="i   like   java   coding";
		System.out.println(str);
		/*
		char[] ch=str.toCharArray();
		for(char ch1:ch)
		{
			int count =0;
			if(ch1!=' ')
			{
				System.out.print(ch1);
			}
			
			else if(ch1==' ')
			{
				System.out.print(' ');
				continue;
			}
			else if(count >1)
			{
				break;
			}
		}
		*/
		str=str.replace("   ", " ");
		System.out.println(str);
	}

}
