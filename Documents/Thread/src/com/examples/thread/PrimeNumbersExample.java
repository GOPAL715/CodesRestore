package com.examples.thread;

class Prime extends Thread{
	private int number;
	
	public Prime (int number) {
		this.number = number;
	}
	
	private boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i =2;i<=Math.sqrt(n);i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
	}
	
	public void run() {
		if(isPrime(number)) {
			System.out.println(number+" is a prime number" + " and thread name is:  "+Thread.currentThread().getName());
		}else {
			System.out.println(number+ " is not a prime number"+ " and thread name is:  "+Thread.currentThread().getName());
		}
	}
}

public class PrimeNumbersExample {
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Start ");
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("Thread :"+currentThreadName);
		
		for(int i =1;i<=10;i++) {
			Prime p = new Prime(i);
			p.setName("Thread - Prime");
			p.start();
			p.yield();
			//p.join();
			try {
				p.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("End");
	}

}
