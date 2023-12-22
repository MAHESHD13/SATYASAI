package strings_test_12;

public class StringTocharArray_27 {

	public static void main(String[] args)
	{
		String str ="Sathy@Tech@25year$!";
		System.out.println("GIVEN STRING = "+str);
		System.out.println();
		System.out.println("CHARACTER ARRAY OF STRING = ");
		char[] ch=str.toCharArray();
		for(char c:ch)
		{
			System.out.print(c+" ");
		}
		
	}

}
