package com.exam.preparation.GPT;

import java.util.HashSet;

public class FindPairWithGivenSum {
	
	public static void findPair(int arr[], int target) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			
			int diff = target - num;
			
			if(set.contains(diff)) {
				System.out.println("Pair: " + diff + " + " + num + " = " + target);
				return;
			}
			set.add(num);
		}
		System.out.println("No pair found");
	}
	
	public static void main(String[] args) {
		
		int arr[] = {2, 7, 11, 15};
		
		int target= 18;
		
		findPair(arr, target);
		
	}

}
