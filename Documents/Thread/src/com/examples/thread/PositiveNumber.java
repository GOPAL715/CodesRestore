package com.examples.thread;

import java.util.Scanner;

class NumsCheck extends Thread{
	private int number;
	
	public NumsCheck(int n) {
		this.number =n;	
	}
	
	public int getNumber() {
		return number;
	}
	
	
	public String getSign() {
		System.out.println("Thread: "+ Thread.currentThread().getName());
		synchronized(this) {
	if (number>0) {
		return "positive";
	}else if(number < 0) {
		return "negative";
	}
	else {
		return "zero";
	}
		}
	
	}
		
}

class Check extends Thread{
	
	NumsCheck nums;
	
	public Check (NumsCheck nums) {
		this.nums = nums;
	}
	
	public void run() {
		String result =nums.getSign();
        System.out.println("Number " + nums.getNumber() + " is " + result + " (Thread: " + Thread.currentThread().getName() + ")");
	}
	
}
public class PositiveNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter how many numbers yoou want to check: ");
		int count = s.nextInt();
		
		int numbers[] = new int [count];
		System.out.println("Enter the count :"+ count+" of numbers to be entered");
	
		for(int i =0;i<count;i++) {
			numbers[i]= s.nextInt();	
			}
		
		for (int nums : numbers) {
			NumsCheck n = new NumsCheck(nums);
			Check c = new Check(n);
			c.setName("CheckThread -"+ n);
			c.start();
			
		}
		
	}

}
