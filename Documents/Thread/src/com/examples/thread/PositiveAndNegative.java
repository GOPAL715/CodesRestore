package com.examples.thread;

import java.util.Scanner;

class NumberCheck extends Thread{
	private int number;


public NumberCheck(int number) {
	this.number = number; 
}


private String checkNumber(int n) {
	if(n>0) {
		return"positive number" ;
	}else if(n<0) {
		return "negative number";
	} else {
		return "zero";
	}
}

public void run() {
	String result=checkNumber(number);
	System.out.println(number +" is " + result +" and thread name is:  "+ Thread.currentThread().getName());
	}
}

public class PositiveAndNegative {
	public static void main(String[] args) {
		System.out.println("Start");
		String currentThreadName =Thread.currentThread().getName();
		System.out.println("Main Thread: "+ currentThreadName);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to check: ");
		int count = s.nextInt();
		
		int []numbers = new int[count];
		System.out.println("Enter "+count+" numbers: ");
		
		for(int i=0; i<count; i++) {
			numbers[i]= s.nextInt();
		}
		
		for(int num: numbers) {
			NumberCheck t = new NumberCheck(num);
			t.setName("Thread - positiveornegative" );
			t.start();
			
			try {
				t.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
	
		}
		System.out.println("End");
		
	}

}
