package com.exam.preparation.gpt;

public class CountSetBits {
	
	public static int countBits(int n) {
		
		int count =0;
		
		while(n > 0) {
			
			n = n & (n-1);
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int num =11;
		
		System.out.println("Set bits: "+ countBits(num));
	}

}
