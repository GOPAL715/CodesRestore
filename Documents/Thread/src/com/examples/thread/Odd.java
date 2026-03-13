package com.examples.thread;


	

public class Odd {
	public static void main(String[] args) {
		PrintOdd p = new PrintOdd();
		p.setName("Thread - Odd");
		p.run();
		p.start();
	}
	
	

}
class PrintOdd extends Thread{
public void run() {
	
	for(int i =0 ;i<=10;i++) {
		if(i%2!=0) {
			System.out.println("Thread Name: "+Thread.currentThread().getName() + "  Odd number: " + i);
		}
		try {
			Thread.sleep(500);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	}
}