package com.examples.interthreadcommunication;

class SharedData{
	private boolean dataAvaliable = false;
	
	public synchronized void produce() {
		System.out.println("Producer Thread Started");
		dataAvaliable = true;
		System.out.println("Producer produced the data");
		System.out.println("Producer data avaliability: "+ dataAvaliable);
		notify();

	}
	
	public synchronized void consume() {
		System.out.println("Consumer is waiting for data");
		while(!dataAvaliable) {
			try {
				System.out.println("Consumer data avaliability: "+ dataAvaliable+" waiting");
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Consumer consumed the data");
		dataAvaliable = false;
		System.out.println("Consumer data avaliability: "+ dataAvaliable);


	}
}

class Producer extends Thread{
	 SharedData sharedData;
	
	public Producer(SharedData sharedData) {
		this.sharedData=sharedData;
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		sharedData.produce();
	}
}

class Consumer extends Thread{
	SharedData sharedData;
	
	public Consumer(SharedData sharedData) {
		this.sharedData= sharedData;
	}
	
	public void run() {
		sharedData.consume();
	}
	
}

public class BasicExample {

	public static void main(String[] args) {
		SharedData s = new SharedData();
		
		Producer p = new Producer(s);
		Consumer c = new Consumer(s);
		
		p.start();
		c.start();
		

	}

}
