package collectionsframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_01 {

	public static void main(String[] args) 
	{
		LinkedList<String> companies=new LinkedList<String>();
		companies.add("google");
		companies.add("tcs");
		companies.add("infosys");
		companies.add("amazon");
		companies.add("oracle");
		companies.add("sathyatech");
		System.out.print(companies+" ");
		System.out.println();
		
		String first=companies.get(0);
		System.out.println("FIRST COMPANY : "+first);
		
		String last=companies.get(companies.size()-1);
		System.out.println("LAST COMPANY : "+last);
		
		String third=companies.get(2);
		System.out.println("THIRD COMPANY : "+third);
		
		for(int i=0;i<3;i++)
		{
			System.out.println((i+1)+".....COMAPNY...."+companies.get(i));
		}
		for(String company:companies)
		{
			System.out.println(company);
		}
	}

}
