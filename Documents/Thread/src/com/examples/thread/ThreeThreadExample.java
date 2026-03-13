package com.examples.thread;

class OneThread extends Thread{
	public void run() {
		System.out.println("I'm inside the OneThread.run() "+ Thread.currentThread().getName());
	}
}

class TwoThread extends Thread{
	public void run() {
		System.out.println("I'm inside the TwoThread.run() "+ Thread.currentThread().getName());
	}
}

class ThreeThread extends Thread{
	public void run() {
		System.out.println("I'm inside the ThreeThread.run() "+ Thread.currentThread().getName());
	}
}

class PrintEven extends Thread{
	public void printEven() throws InterruptedException {
		for(int i=1;i<10;i++) {
			if(i%2==0) {
				System.out.println("Even :"+ i);
				wait();
			}
		}
		
	}
	public void run() {
		try {
			printEven();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public class ThreeThreadExample {
	public static void main(String[] args) {
		OneThread o = new OneThread();
		TwoThread t = new TwoThread();
		ThreeThread t1 = new ThreeThread();
		PrintEven p = new PrintEven();
		
		p.start();
		o.start();
		t.start();
		t1.start();
		
	}

}
