package com.exam.preparation.chatgpt;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
	
	public static void removeDuplicates(int arr[]) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num:arr) {
			set.add(num);
		}
		
		System.out.println("Removed Duplicates: " + set);
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,1,3,2,3};
		
		removeDuplicates(arr);
	}

}
