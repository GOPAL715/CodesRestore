package com.exam.preparation.chatgpt;

public class MissingNumber {
	
	public static int missingNumber(int arr[] , int n) {
		
		int expected = n* (n+1) / 2;
		
		int sum =0;
		
		for(int num :arr) {
			sum += num;
			
		}
		return expected - sum;
	}
	
	public static void main(String[] args) {
		
		int arr[] ={1,2,4,5};
		
		System.out.println("Missing number : "+ missingNumber(arr, 5));
	}

}
