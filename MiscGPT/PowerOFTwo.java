package com.exam.preparation.gpt;

public class PowerOFTwo {
	
	public static boolean powerOfTwo(int n) {
		
		if(n<=0) {
			return false;
		}
		
		return (n &(n-1)) ==0;
	}
	
	public static void main(String [] args) {
		
		int num =16;
		
		if(powerOfTwo(num)) {
			System.out.println("power of 2");
		}else {
			System.out.println("not power of 2");
		}
		
		System.out.println(powerOfTwo(num));
	}

}
