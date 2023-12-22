package com.multithreading;

class MyThread extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("GOOD MORNING...");
		
	}
}
public class ThreadEx_01 
{
	public static void main(String[] args) 
	{
		MyThread myThread=new MyThread();
		myThread.start();
	}
}
