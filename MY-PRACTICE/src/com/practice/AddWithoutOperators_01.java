package com.practice;

public class AddWithoutOperators_01 {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=5;
//		System.out.println(a|b);
		System.out.println(~(a |(~b)));		//	10--->1010
											//   5--->0101
											//	-----------
											//	10--->1010
											// 	 5--->1010
											//-------------
											//add--->10100
											//	---->01011
											//	---->   +1
											//	-----------
											//		  1100
											//-------------
											//		0011
											//		  +1
											//     ------
											//		0100
		//	
		for(int i=1;i<=b;i++)
		{
			a++;
		}
		System.out.println(a);
		
		for(int i=1;i<=b;i++)
		{
			a--;
		}
		System.out.println(a);
		
		
	}

}
