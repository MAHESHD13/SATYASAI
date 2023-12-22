package strings_test_13;

public class SwapCharacterSideBySide_113 
{
	public static void main(String[] args) 
	{
		String s1 = "sathyatechnologies";
		System.out.println("GIVEN STRING : "+s1);
		char[] ch=s1.toCharArray();
		for(int i=0;i<ch.length-1;i=i+2)
		{
			char temp=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=temp;
		}
		String result=new String(ch);
		System.out.println("AFTER SWAPPING : "+result);
	}

}
