package com.exam.preparation.gpt;

import java.util.Arrays;

public class CheckAnagram {
	
	public static boolean isAnagram(String s1, String s2) {
		
		s1= s1.toLowerCase();
		s2= s2.toLowerCase();
		
		if(s1.length() != s2.length()) {
			return false;
		}
	
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a,b);
	}
	
	public static void main(String[] args) {
		
		String s1= "Listen";
		String s2 ="Silent";
		
		if(isAnagram(s1, s2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("not Anagram");
		}
	}

}
