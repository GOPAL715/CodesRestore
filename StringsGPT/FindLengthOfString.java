package com.exam.preparation.gpt;

public class FindLengthOfString {
	
	public static int findLength(String str) {
		
		int count =0;
		
		for(char c : str.toCharArray()) {
			
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		String str ="Hello";
		
		System.out.println("Length: "+ findLength(str));
	}

}
