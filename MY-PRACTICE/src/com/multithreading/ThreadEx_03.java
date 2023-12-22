//package com.multithreading;
//
//import java.util.Random;
//
//class Mythread1 extends Thread
//{
//	
//	public void run()
//	{
//		Random random=new Random();
//		for(int i=0;i<5;i++)
//		{
//			int x=random.nextInt(10000,99999);
//			System.out.println(x);
//		}
//	}
//}
//
//class Mythread2 extends Thread
//{
//	
//	public void run()
//	{
//		Random random=new Random();
//		for(int i=0;i<5;i++)
//		{
//			String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//			StringBuilder s1=new StringBuilder();
//			for(int j=1;j<=5;j++)
//			{
//				int index=(int) (s.length() * Math.random());
//				s1.append(s.charAt(index));
//			}
//			System.out.println(s1);
//		}
//	}
//}
//class MaheshT extends Thread
//{
//	public void run()
//	{
//		String sai="abcdefghijklmnopqrstuvwxyz";
//		
//		Random r=new Random();
//		int in = Math.random();
//		String s =sai.charAt();
//	}
//}
//public class ThreadEx_03 {
//
//	public static void main(String[] args) 
//	{
//		Mythread1 mythread1=new Mythread1();
//		mythread1.start();
//		Mythread2 mythread2=new Mythread2();
//		mythread2.start();
//	}
//}
