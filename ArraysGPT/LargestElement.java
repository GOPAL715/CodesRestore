package com.exam.preparation.chatgpt;

public class LargestElement {
	
	public static void maxElement(int arr[]) {
		
		int max = arr[0];
		int sMax = arr[1];
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]>max) {
				sMax=max;
				max = arr[i];
			}
		}
		System.out.println("MaxElemnt: " + max);
		System.out.println("SecondMaxElemnt: " + sMax);
	}
	

	public static void main(String[] args) {
		
		int arr[] = {5,22,4,66,87,9};
		
		maxElement(arr);
	}
	

}
