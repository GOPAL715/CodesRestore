package com.examples.thread;

class Cooking extends Thread{
	public void run() {
		System.out.println("Done with Cooking ");
	}
}

class Serving extends Thread{
	public void run() {
		System.out.println("Serving the food");
	}
}
public class Food {
	public static void main(String[] args) throws InterruptedException {
		Cooking c = new Cooking();
		c.start();
		c.yield();
		c.join();
	
		
		Serving s = new Serving();
		s.start();
		
	}
	

}
