package com.examples.thread;

class Vehicle implements Runnable{

	@Override
	public void run() {
		System.out.println("Vehicle Requirement for driving and thread name: "+ Thread.currentThread().getName());
		System.out.println("The state is: "+ Thread.currentThread().getState());
		license();
	}
	
	private void license() {
		System.out.println("For Vehicle driving you need license and thread name: "+ Thread.currentThread().getName());
		System.out.println("The state is: "+ Thread.currentThread().getState());
	}
	
}

public class RunnableExample {
	public static void main(String[] args) {
		System.out.println("Start "+ "The state is: "+ Thread.currentThread().getState());
		Vehicle v = new Vehicle();
		Thread t = new Thread(v);
		Thread t1 = new Thread(v);
		Thread t2 = new Thread(v);
		System.out.println( "The state is: "+ t.getState());
		System.out.println( "The state is: "+ t1.getState());
		System.out.println( "The state is: "+ t2.getState());

		t.start();
		t1.start();
		t2.start();
		

		
		System.out.println("End "+ "The state is: "+ Thread .currentThread().getState());
	}

}
