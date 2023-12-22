package strings_test_13;

public class LongestWordWithoutDuplicate_217 {

	public static void main(String[] args) 
	{
		String str1="Sathya Technologies is very good institute";
		str1=str1.toLowerCase();
		String[] str2=str1.split(" ");
		String str3=" ";
		int index=0;
		for(int i=0;i<str2.length;i++)
		{
			String word=str2[i];
			boolean flag=false;
			for(int j=0;j<word.length();j++)
			{
				char ch=word.charAt(j);
				for(int k=j+1;k<word.length();k++)
				{
					if(ch==word.charAt(k))
					{
						break;	
					}
					index=j;
				}
			}
			
			System.out.println(index);
			str3=str2[index];
		}
		System.out.println(str3);
		String[] str4=str3.split(" ");
		int index1=0,maxlength=0;
		for(int i=0;i<str4.length;i++)
		{
			int length=str4[i].length();
			if(maxlength>length)
			{
				length=maxlength;
				index1=i;
			}
		}
		System.out.println(str1+" "+str4[index1]);
	}

}

