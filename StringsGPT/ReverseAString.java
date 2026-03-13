package com.exam.preparation.gpt;

public class ReverseAString {
	
	public static String reverse(String str) {
		
		String result ="";
		
		for(int i = str.length()-1; i >=0; i-- ) {
			result = result + str.charAt(i);
		}
		return result;
	}
	
	public static void main(String [] args) {
		
		String str = "hello";
		
		System.out.println("Reversed: " + reverse(str));
	}

}
