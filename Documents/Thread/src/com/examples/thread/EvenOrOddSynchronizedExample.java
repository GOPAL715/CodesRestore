package com.examples.thread;

class Task{
	
	public synchronized void printEven() {
		for(int i=0;i<15;i++ ) {
			if(i%2==0) {
				System.out.println(i+" is even "+ Thread.currentThread().getName());
			}
		}
	}
	
	public synchronized void printOdd() {
		for(int i =0; i<15;i++) {
			if(i%2!=0) {
				System.out.println(i+" is odd "+ Thread.currentThread().getName());
			}
		}
	}
}

class OddThread1 extends Thread{
	
	Task task;
	
	public OddThread1(Task task) {
		
		super();
		
		this.task = task;
		}
	public void run() {
		
		task.printOdd();
	}
}

class EvenThread2 extends Thread{
	
	Task task;
	public EvenThread2(Task task) {
		super();
		this.task = task;
		}
	public void run() {
		task.printEven();
	}
}



public class EvenOrOddSynchronizedExample {

	public static void main(String args[]) {
		
		Task task = new Task();
		
		OddThread1 oddThread = new OddThread1(task);
		EvenThread2 e = new EvenThread2(task);
		
		oddThread.start();
		e.start();
		
	}
}
