package com.mahesh.wrapperclass;

public class WrapperPrimitive
{

	public static void main(String[] args)
	{
		System.out.println("AUTOBOXING EXAMPLE : ");
		int a=10;
		Integer b=Integer.valueOf(a);
		Integer c=a+b;
		System.out.println("a : "+a+" + "+"b : "+b+" = "+c);
		System.out.println("==================================");
		
		System.out.println("UNBOXING EXAMPLE : ");
		Integer aa=new Integer(20);
		int bb=aa.intValue();
		int cc=aa*bb;
		System.out.println("aa : "+aa+" + "+"bb : "+bb+" = "+cc);
		System.out.println("====================================");
		

	}

}
