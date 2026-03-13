package com.examples.thread;

class SharedResource {
	
	private final Object lock1 = new Object();
	private final Object lock2 = new Object();
	
	
	void methodA() {
		synchronized (lock1) {
			System.out.println("Thread 1 :"+Thread.currentThread().getName()+" Locked ");
			synchronized (lock2) {
				System.out.println("Thread 1 :"+ Thread.currentThread().getName()+ " Locked ");
			}
		}
	}
	
	void methodB() {
		synchronized (lock1) {
			System.out.println("Thread 2 "+ Thread.currentThread().getName()+ " Locked ");
			synchronized (lock2) {
				System.out.println("Thread 2 "+ Thread.currentThread().getName()+ " Locked ");
		}
	}
}
}

class MyThread extends Thread{
	SharedResource s;
	
	MyThread (SharedResource s){
		this.s=s;
		
	}
	public void run() {
		s.methodA();
		s.methodB();
	}
}

public class DeadLockExample {
	
	public static void main(String[] args) {
		SharedResource s1 = new SharedResource();
		 MyThread m1 = new MyThread(s1);
		 MyThread m2 = new MyThread(s1);
		 
		 m1.start();
		 m2.start();
	}

}
