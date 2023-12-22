package strings_test_12;

public class StringComparison 
{
	public static void main(String[] args) 
	{
		String s1=new String("mahesh");
		System.out.println("STRING S1 = "+s1);
		s1.intern();
		System.out.println("STRING S1 HASHCODE = "+s1.hashCode());
		String s2="mahesh";
		System.out.println("STRING S2 = "+s2);
		System.out.println("STRING S2 HASHCODE = "+s2.hashCode());
		System.out.println("STRING S1 = "+s1+"\nSTRING S2 = "+s2+"\n"+(s1==s2));
		System.out.println(s1.equals(s2));
	}

}
