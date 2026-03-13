package com.examples.thread.reentranctlock;

import java.util.concurrent.locks.ReentrantLock;

class Counter{
	private int counter =0 ;
	ReentrantLock r = new ReentrantLock();
	
	public void increment() {
	    for (int i = 0; i < 1000; i++) {
	        r.lock();
	        try {
	            counter++;
	            if (counter % 100 == 0) {
	                System.out.println(Thread.currentThread().getName() + " incremented counter to: " + counter);
	            }
	        } finally {
	            r.unlock();
	        }
	    }
	}
}

class MyThread2 implements Runnable {
    
	private final Counter counter;
    
    public MyThread2(Counter counter) {
        this.counter = counter;
    }
    @Override
    public void run() {
        counter.increment();
    }
    
}

public class GrokExample  {
	public static void main(String[] args) throws InterruptedException{
		
	
	Counter c = new Counter();
	
	Thread m = new Thread(new MyThread2(c), "Thread 1");
	Thread m1 = new Thread(new MyThread2(c), "Thread -2");
	

	
	m.start();
	m1.start();
	
	}


}
