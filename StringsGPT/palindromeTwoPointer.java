package com.exam.preparation.gpt;

public class palindromeTwoPointer {
	
	public static boolean isPalindrome(String str) {
		
		int left =0;
		int right = str.length()-1;
		
		while(left<right) {
			if(Character.toLowerCase(str.charAt(left))!= Character.toLowerCase(str.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String str ="Madam";
		
		if(isPalindrome(str)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}
}
