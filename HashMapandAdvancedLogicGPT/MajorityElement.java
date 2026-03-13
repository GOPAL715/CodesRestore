package com.exam.preparation.GPT;

import java.util.HashMap;

public class MajorityElement {
	
	public static int findMajority(int arr[]) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr) {
			
			map.put(num, map.getOrDefault(num, 0) +1);
			
			if(map.get(num) > arr.length /2) {
				return num;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2,2,1,2,3,2,2};
		
		int result =findMajority(arr);
		
		if(result != -1) {
			System.out.println("Majority Element : " + result);
		}else {
			System.out.println("No Majority Element");
		}
	}

}
