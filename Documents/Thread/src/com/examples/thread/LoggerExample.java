package com.examples.thread;

class Logger{
	public static void getMessage(String message) {
		System.out.println("Logger.getMessage()"+ Thread.currentThread().getName());
		synchronized(Logger.class) {
			System.out.println("Log: "+ message+ Thread.currentThread().getName());
		}
	}
}

class LogThread  extends Thread{
	private String message;
	
	public LogThread(String message) {
		this.message= message;
	}
	
	public void run() {
		Logger.getMessage(message);
	}
}

public class LoggerExample {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			LogThread l = new LogThread("Message :"+ i);
			l.start();
		}
	}

}
