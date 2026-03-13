package com.examples.thread;

public class EvenOrOdd {
	
	    public static void main(String[] args) {
	        System.out.println("Start");
	        System.out.println("Main Thread: " + Thread.currentThread().getName());

	        EvenThread evenThread = new EvenThread();
	        evenThread.setName("Thread 1 - Even");
	        evenThread.start();

	        OddThread oddThread = new OddThread();
	        oddThread.setName("Thread 2 - Odd");
	        oddThread.start();

	        System.out.println("End");
	    }
	}

	class EvenThread extends Thread {
	    @Override
	    public void run() {
	        for (int i = 2; i <= 15; i++) {
	            if(i%2 ==0) {
	            	 System.out.println(Thread.currentThread().getName() + " Even number: " + i);
	            }
	        }
	    }
	}

	class OddThread extends Thread {
	    @Override
	    public void run() {
	        for (int i = 1; i <= 15; i++) {
	        	if(i % 2 !=0) {
	        		System.out.println(Thread.currentThread().getName() + "  Odd number: " + i);
	        	}
	        }
	    }
	}



