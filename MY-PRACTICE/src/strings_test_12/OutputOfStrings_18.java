package strings_test_12;

public class OutputOfStrings_18 {

	public static void main(String[] args) 
	{
		String s1="chandu";
		String s2="chandu";
		String s3=new String("john");
		String s4=new String("pavan");
		System.out.println(s1==s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3==s4);
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
