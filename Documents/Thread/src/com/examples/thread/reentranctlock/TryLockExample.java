package com.examples.thread.reentranctlock;

import java.util.concurrent.locks.ReentrantLock;

class AccountMgnt{
	ReentrantLock reen = new ReentrantLock();
	
	public void addPayee() {
		reen.lock();
		
		for(int i=0;i<10;i++) {
			System.out.println(i+" "+ Thread.currentThread().getName());
		}
		reen.unlock();
	}
}

class MyThread extends Thread{
	
	AccountMgnt accountMgnt;
	
	 public MyThread(AccountMgnt accountMgnt) {
	        this.accountMgnt = accountMgnt;
	    }
	
	public void run() {
		accountMgnt.addPayee();
	}
}

public class TryLockExample {
	public static void main(String[] args) {
		AccountMgnt acc = new AccountMgnt();
		MyThread m = new MyThread(acc);
		MyThread m1 = new MyThread(acc);
		MyThread m2 = new MyThread(acc);
		
		 m.start();
	     m1.start();
	     m2.start();
		
	}
}
