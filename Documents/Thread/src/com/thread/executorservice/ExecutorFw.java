package com.thread.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread{
	public void run() {
		System.out.println("MyTHread.run()...." + Thread.currentThread().getName());
	}
}

public class ExecutorFw {
	
	public static void main(String[] args)  {
		ExecutorService service = Executors.newCachedThreadPool();
		ExecutorService service1 = Executors.newSingleThreadExecutor();
		ExecutorService service2 = Executors.newFixedThreadPool(25);
		
		MyThread thread = new MyThread();
		for(int i=0; i<10;i++) {
		System.out.println("Using CachedThreadPool : "+service.submit(thread));	
		//System.out.println("Using SingleThreadExecutor: "+service1.submit(thread));
		//System.out.println("Using FixedThreadPool: "+ service2.submit(thread));
		}
		service.shutdown();
	}

}
