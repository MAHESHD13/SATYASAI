package com.arrays;

public class ArraysEx1 
{

	public static void main(String[] args) 
	{
		int[] prices = {10,45,24,67,23};
		
		System.out.println(prices[0]);
		System.out.println(prices[1]);
		System.out.println(prices[2]);
		System.out.println(prices[3]);
		System.out.println(prices[4]);
		System.out.println();
	
		for(int i=0;i<prices.length;i++)
		{
			System.out.println(prices[i]);	
		}
		System.out.println();
	
		for(int price : prices)
		{
			System.out.println(price);
		}
	}

}
