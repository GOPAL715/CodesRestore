package com.thread.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThreadQ extends Thread{
	
	public void run() {
		System.out.println("MyThreadQ.run()"+ Thread.currentThread().getName());
	}
}

public class DynamicExecutorExample {

	public static void main(String[] args) {
		ExecutorService s = Executors.newCachedThreadPool();
		MyThreadQ q = new MyThreadQ();
		for(int i=0;i<10;i++) {
			s.submit(q);
		}
		s.shutdown();
	}

}
