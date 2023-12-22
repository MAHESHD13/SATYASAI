package strings_test_13;

public class StringTrim_112 {

	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer("sathyatechnologies");
		System.out.println(s.capacity());
		s.trimToSize();
		System.out.println(s.capacity());
		
	}

}
