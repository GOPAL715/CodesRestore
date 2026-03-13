package com.exam.preparation.gpt;

public class CheckPalindromeString {
	
	public static boolean isPalindrome(String str) {
		
		String reverse ="";
		
		for(int i = str.length()-1; i>=0; i++) {
			reverse = reverse + str.charAt(i);
		}
		
		return str.equals(reverse);
	}
	
	public static void main(String[] args) {
		
		String str = "madam";
		
		if(isPalindrome(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
