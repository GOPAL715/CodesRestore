package com.examples.interthreadcommunication;


class WriteAndRead{
	private String message;
	
	public synchronized void writeMessage(String message) {
		
		System.out.println("Writing the message: "+ Thread.currentThread().getName());
		this.message=  message;
		System.out.println("Message Written : "+ Thread.currentThread().getName());
		this.notify();
	}
	
	public synchronized void readMessage() throws InterruptedException{
		System.out.println("Waiting to read the message: " +Thread.currentThread().getName());
		this.wait();
		System.out.println("Message read :"+ message+" "+ Thread.currentThread().getName());
	}
}

class ReaderThread extends Thread{
	
	WriteAndRead w;
	
	public ReaderThread(WriteAndRead w) {
		this.w = w;
	}
	
	public void run() {
		try {
			w.readMessage();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class WriteThread extends Thread{
	
WriteAndRead w;
	
	public WriteThread(WriteAndRead w) {
		this.w = w;
	}
	
	public void run() {
		try {
			Thread.sleep(2000);
			w.writeMessage("I'll come class to  class early from tomorrow");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//w.writeMessage("This is test message ...");
	}
}

public class InterThreadExample {
	
	  public static void main(String[] args)
	    {
		WriteAndRead obj = new WriteAndRead();
		ReaderThread readThread = new ReaderThread(obj);
		WriteThread writeThread = new WriteThread(obj);

		readThread.setName(" : [Reader Thread]");
		writeThread.setName(": [Writer Thread]");
		readThread.start();
		writeThread.start();
	    }


}
