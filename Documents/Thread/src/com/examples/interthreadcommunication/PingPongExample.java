package com.examples.interthreadcommunication;

class Shared{
	boolean pingTurn = true;
	
	public synchronized void printPing() {
		for(int i =0;i<5;i++) {
			while(!pingTurn) {
				try {
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Ping");
			pingTurn = false;
			notifyAll();
		}
	}
	
	public synchronized void printPong() {
		for(int i=0;i<5;i++) {
			while(pingTurn) {
				try {
					wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Pong");
			pingTurn= false;
			notifyAll();
		}
	}
}

class PingThread extends Thread{
	Shared s;
	
	public PingThread(Shared s ) {
		this.s = s;
	}
	public void run() {
		s.printPing();
	}
}

class PongThread extends Thread{
	Shared s;
	
	public PongThread(Shared s ) {
		this.s = s;
	}
	public void run() {
		s.printPong();
	}
}


public class PingPongExample {
	public static void main(String[] args) {
		Shared s = new Shared();
		PingThread p = new PingThread(s);
		PongThread p1 = new PongThread(s);
		
		p.start();
		p1.start();
	}

}
