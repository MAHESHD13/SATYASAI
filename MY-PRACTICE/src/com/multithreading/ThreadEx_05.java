package com.multithreading;
class MyTable extends Thread
{
	int num;
	public MyTable(int num)
	{
		this.num=num;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
	}
}
public class ThreadEx_05 
{
	public static void main(String[] args) throws InterruptedException 
	{
		MyTable myThread=new MyTable(4);
		myThread.start();
		myThread.join();
		System.out.println("------------------------------");
		MyTable myThread1=new MyTable(8);
		myThread1.start();
	}

}
