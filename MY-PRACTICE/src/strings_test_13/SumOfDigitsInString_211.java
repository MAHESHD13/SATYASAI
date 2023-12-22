package strings_test_13;

public class SumOfDigitsInString_211 {

	public static void main(String[] args) 
	{
		/*
		String s="Sathya@1234!!25Years";
		char[] ch=s.toCharArray();
		int[] numbers=new int[s.length()];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				numbers[i]=ch[i]-48;
			}
		}
		for(int num:numbers)
		{
			System.out.println(num);	
		}
		
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum=sum+numbers[i];
		}
		System.out.println("SUM OF NUMBERS IN A "+s+" = "+sum);
	*/
		
		String s="Sathya@1234!!25Years";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				sum=sum+Character.getNumericValue(s.charAt(i));
			}
		}
		System.out.println("SUM OF DIGITS IN "+s+" = "+sum);
	}

}
