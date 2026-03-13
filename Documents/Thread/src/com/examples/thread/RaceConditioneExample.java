package com.examples.thread;


class BankAccount{
	private int balance =100;
	
	public void withdraw(int amount) {
		if(balance>= amount) {
			System.out.println(Thread.currentThread().getName());
			
		}else {
			System.out.println(Thread.currentThread().getName());

		}
	}
}

class WithdrawalThread extends Thread{
	BankAccount account;
	
	public WithdrawalThread(BankAccount account) {
		this.account= account;
	}
	public void run() {
		account.withdraw(75);
	}
}

public class RaceConditioneExample {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		
		WithdrawalThread w = new WithdrawalThread(b);
		WithdrawalThread w1 = new WithdrawalThread(b);
		
		w.start();
		w1.start();

		
	}

}
