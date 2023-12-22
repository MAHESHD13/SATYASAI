package strings_test_13;

public class CountAlphabetsAndDigitsAndSpecial_205 
{
	public static void main(String[] args) 
	{
		String s="Sathya@25Year$!";
		char[] ch=s.toCharArray();
		int count=0,count1=0,count2=0,count3=0;
		for(char c : ch)
		{
			if(c >='a' && c<='z')
			{
				count++;
			}
			else if(c>='A' && c<= 'Z')
			{
				count1++;
			}
			else if(c>='0' && c<='9')
			{
				count2++;
			}
			else if(c>=33 && c<=47 || c>=58 && c<=64 || c>=91 && c<=96)
			{
				count3++;
			}
		}
		System.out.println("UPPER CASE CHARACTERS : "+count1+"\nLOWER CASE CHARACTERS : "+count+"\nDIGITS : "+count2+"\nSPECIAL CHARACTERS : "+count3);
	}

}
