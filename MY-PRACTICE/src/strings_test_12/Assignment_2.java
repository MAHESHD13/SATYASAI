package strings_test_12;

public class Assignment_2 {

	public static void main(String[] args) 
	{
		String name="java is a programming language";
		//String name1=name.replace(" ","");
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(name.indexOf(ch)==i)
			{
				System.out.print(ch);
			}
		}
	}

}
