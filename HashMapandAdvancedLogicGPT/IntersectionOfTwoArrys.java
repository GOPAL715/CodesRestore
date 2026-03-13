package com.exam.preparation.GPT;

import java.util.HashSet;

public class IntersectionOfTwoArrys {
	
	public static void intersection(int arr1[], int arr2[]) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr1) {
			set.add(num);
		}
		
		for(int num : arr2) {
			if(set.contains(num)) {
				System.out.print(num+ " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4};
		int arr2[] = {3,4,5,6};
		
		intersection(arr1, arr2);
	}

}
