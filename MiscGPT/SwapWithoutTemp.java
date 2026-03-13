package com.exam.preparation.gpt;

public class SwapWithoutTemp {
	
	public static void swap(int a, int b) {
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("After Swap: ");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
	
	public static void main(String[] args) {
		
		int a =18;
		int b = 36;
		
		swap(a, b);
	}

}
