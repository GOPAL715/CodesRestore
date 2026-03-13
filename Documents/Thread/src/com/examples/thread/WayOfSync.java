package com.examples.thread;

class Task1 extends Thread {
	
    @Override
    public void run() {
        fundTransfer();   
        checkBalance();  
    }
    public static  synchronized void fundTransfer() {
        System.out.println("Amount debited by " + Thread.currentThread().getName());
        for (int i = 1; i <= 3; i++) {
            System.out.println("Payment in progress by " + Thread.currentThread().getName());
        }
        System.out.println("Payment successful by " + Thread.currentThread().getName());
        
    }
    public void checkBalance() {
        System.out.println(Thread.currentThread().getName() + " started checking balance");

        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " entered synchronized block");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Checking balance... by " + Thread.currentThread().getName());
            }
            System.out.println(Thread.currentThread().getName() + " finished checking balance");
        }
        System.out.println(Thread.currentThread().getName() + " done");
        
    }
}
public class WayOfSync {
    public static void main(String[] args) {
        Task1 task = new Task1();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
    }
}