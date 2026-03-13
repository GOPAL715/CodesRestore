package com.exam.preparation.chatgpt;

import java.util.Arrays;

public class RotateArray {
	
	public static void rotateLeft(int arr[]) {
		
		int first = arr[0];
		
		for(int i=0; i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = first;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		rotateLeft(arr);
		
		System.out.println(Arrays.toString(arr));
	}
}
