package com.multithreading;
import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadEx_06 {

	public static void main(String[] args) 
	{
		ExecutorService executorService=Executors.newSingleThreadExecutor();
	
		executorService.execute(()->System.out.println(LocalTime.now()));

		executorService.shutdown();
	}

}
