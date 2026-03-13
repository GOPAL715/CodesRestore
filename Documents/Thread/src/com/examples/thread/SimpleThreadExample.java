package com.examples.thread;

public class SimpleThreadExample {
	
	public static void main(String[] args) {
		System.out.println("Start ");
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("Thread :"+currentThreadName);
		
		Example1 e1 = new Example1();
		e1.setName("Thread 1");
		e1.start();
		
		Example e = new Example();
		e.setName("Thread 2");
		e.start();
		
		System.out.println("End ");
		
	}
}		
	class Example1 extends Thread {
		
		@Override
		public void run() {
			System.out.println("Hi, I'm a Gopal from thread :"+ Thread.currentThread().getName());
		}
		
	}
	
	
	class Example extends Thread {
		@Override
		public void run() {
			System.out.println("Hi, I'm a Gopal from thread :"+ Thread.currentThread().getName());
		}
	}


