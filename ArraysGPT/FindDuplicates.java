package com.exam.preparation.chatgpt;

import java.util.HashSet;

public class FindDuplicates {
	
	public static void findDuplicates(int arr[]) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			
			if(set.contains(num)) {
				System.out.println("Duplicate: "+ num);
			}
			else {
				set.add(num);
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,2,3,5,4,4,5,6};
		
		findDuplicates(arr);
	}

}
