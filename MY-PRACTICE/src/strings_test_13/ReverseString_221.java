package strings_test_13;

public class ReverseString_221 {

	public static void main(String[] args) 
	{
		String str="CJSS TECHNOLOGIES IS AWESOME";
		String[] words = str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}
	}

}
