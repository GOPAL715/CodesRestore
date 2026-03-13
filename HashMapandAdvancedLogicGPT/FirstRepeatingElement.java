package com.exam.preparation.GPT;

import java.util.HashMap;

public class FirstRepeatingElement {
	
	public static int firstRepeatimgElement(int arr[]) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i =0; i<arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				return arr[i];
			}
			map.put(arr[i], 1);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,3,4,5,3,6};
		
		int res = firstRepeatimgElement(arr);
		
		if(res != -1) {
			System.out.println("First Repeating Element: "+ res);
		}else {
			System.out.println("No Repeating Element");
		}
	}
}
