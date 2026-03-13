package com.exam.preparation.chatgpt;

import java.util.HashMap;

public class FrequencyOfElements {
	
	public static void frequency(int arr[]) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num ,  map.getOrDefault(num, 0) +1);
		}
		
		for(int key: map.keySet()) {
			System.out.println(key+" -> "+map.get(key));
		}
		
		
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,3,1,3,2};
		
		frequency(arr);
	}

}
