package com.exam.preparation.gpt;

import java.util.LinkedHashSet;

public class RemoveDuplicatesCharacters {
	
	public static String removeDuplicates(String str) {
		
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char ch : str.toCharArray()) {
			set.add(ch);
		}
		
		String result ="";
		
		for(char ch : set) {
			result = result +ch;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String s= "programming";
		
		System.out.println(removeDuplicates(s));
	}
	

}
