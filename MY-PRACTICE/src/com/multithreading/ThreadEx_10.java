package com.multithreading;

class TPriority extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}
public class ThreadEx_10 
{
	public static void main(String[] args) 
	{
		TPriority priority1=new TPriority();
		priority1.setPriority(10);
		priority1.setName("Thread With Priority-10");
		
		
		TPriority priority=new TPriority();
		priority.setPriority(3);
		priority.setName("Thread With Priority-3");
		
		priority1.start();
		priority.start();
		
	}

}
