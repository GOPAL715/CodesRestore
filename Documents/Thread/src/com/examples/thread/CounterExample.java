package com.examples.thread;

class Counter{
	private int count =0;
	
	public synchronized void increment() {
		count++;
		System.out.println("count is: "+ count+" "+ Thread.currentThread().getName());
		
	}
	
	public int getCount() {
		return count;
	}
	
}

class IncrementThread extends Thread{
	
	Counter counter;
	
	public IncrementThread(Counter counter) {
		this.counter = counter;
		
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			counter.increment();
		}
	}
}

public class CounterExample {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		IncrementThread c = new IncrementThread(counter);
		IncrementThread c1 = new IncrementThread(counter);

		
		c.start();
		c1.start();
	}

}
