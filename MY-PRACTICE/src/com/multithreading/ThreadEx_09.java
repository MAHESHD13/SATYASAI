package com.multithreading;

public class ThreadEx_09 
{
	public static void main(String[] args) 
	{
		Integer[] a= {1,2,3,4,5};
		Integer[] b= {4,5,8,6,9};
		new Thread(()->ThreadEx_09.sumOfArrayElements(a)).start();
		new Thread(()->ThreadEx_09.sumOfArrayElements(b)).start();
		
		
	}
	static void sumOfArrayElements(Integer[] a)
	{
		Integer sum=0;
		for(Integer i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
