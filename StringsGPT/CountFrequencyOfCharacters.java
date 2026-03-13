package com.exam.preparation.gpt;

import java.util.HashMap;

public class CountFrequencyOfCharacters {
	
	public static void frequency(String str) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char ch: str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) +1);
		}
		
		for(char key : map.keySet()) {
			System.out.println(key + " -> " + map.get(key));
		}
	}
	
	public static void main(String[] args) {
		frequency("GOPALGUDIPATI");
	}

}
