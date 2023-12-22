//package com.multithreading;
//class MyThread121 extends Thread
//{
//	int first,last;
//	public MyThread121(int first,int last)
//	{
//		this.first=first;
//		this.last=last;
//	}
//	public void run() 
//	{
//		for(int i=first;i<=last;i++)
//		{
//			System.out.print(i+" ");
//		}	
//	}
//}
//class MyThread1 extends Thread
//{
//	char first1,last1;
//	public MyThread1(char first1,char last1)
//	{
//		this.first1=first1;
//		this.last1=last1;
//	}
//	@Override
//	public void run() 
//	{
//		for(char ch=first1;ch<=last1;ch++)
//		{
//			System.out.print((char)ch+" ");
//		}
//	}
//}
//public class ThreadEx_04 {
//
//	public static void main(String[] args) 
//	{
//		MyThread121 myThread121=new MyThread121(0,9);
//		myThread121.start();
//		MyThread1 myThread1=new MyThread1('a', 'z');
//		myThread1.start();
//	}
//
//}
//
