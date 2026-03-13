package com.thread.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread1 implements Callable<String>{
	
	@Override
	public String call() {
		System.out.println("MyThread1.call()  "+ Thread.currentThread().getName());
		String status = pay();
		return status;
	}
	
	public String pay() {
		System.out.println("MyThread1.pay()");
		return "sucess";
	}
	
}

public class CallableExample {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newCachedThreadPool();
		MyThread1 t1 = new MyThread1();
		for(int i = 0; i < 10; i++) {
			Future<String> future = service.submit(t1);
			System.out.println(future.get());
		}
		service.shutdown();
	}

}
