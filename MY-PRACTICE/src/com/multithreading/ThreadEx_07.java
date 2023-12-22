package com.multithreading;
class TNames extends Thread
{
	public void run()
	{
		System.out.println(currentThread().getName()+" "+currentThread().getId());
		
	}
}
public class ThreadEx_07 {

	public static void main(String[] args) 
	{
		TNames names=new TNames();
		names.start();
		
		TNames names1=new TNames();
		names1.start();
		
		TNames names2=new TNames();
		names2.start();
		
		TNames names3=new TNames();
		names3.start();
		
		TNames names4=new TNames();
		names4.start();
		
		TNames names5=new TNames();
		names5.start();
		
		TNames names6=new TNames();
		names6.start();
		
		TNames names7=new TNames();
		names7.start();
		
	}

}
