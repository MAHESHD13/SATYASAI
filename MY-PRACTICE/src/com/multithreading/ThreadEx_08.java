package com.multithreading;

class MyAdditionThread extends Thread
{
	int sum=0;
	@Override
	public void run()
	{
		synchronized (this)
		{
			for(int i=1;i<=10;i++)
			{
				sum += i;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			notify();
		}
		
	}
}
public class ThreadEx_08 {

	public static void main(String[] args) throws InterruptedException 
	{
		MyAdditionThread t=new MyAdditionThread();
		t.start();
		synchronized (t)
		{
			System.out.println("Main Thread is Waiting for Result...");
			t.wait();
		}
		System.out.println("The Total Result..."+t.sum);
	}
}
