package com.exam.preparation.gpt;

import java.util.HashMap;

public class FirstNonRepeatingElement {
	
	public static char firstNonRepeat(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) +1);
		}
		
		for(char ch : str.toCharArray()) {
			if(map.get(ch) == 1) {
				return ch;
			}
		}
		return ' ';
	}
	
	public static void main(String[] args) {
		
		String str ="swiss";
		
		System.out.println(firstNonRepeat(str));
	}

}
