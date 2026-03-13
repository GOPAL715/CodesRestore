package com.exam.preparation.searching.gpt;

public class BinarySearchIterative {
	
	public static int binarySearch(int arr[], int key) {
		int low =0;
		int high = arr.length;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(arr[mid] == key) {
				return mid;
			}else if(arr[mid] < key) {
				low = mid+1;
			}else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,35,40,45,50,55,60};
		int key = 35;
		
		int result = binarySearch(arr, key);
		
		if(result != -1) {
			System.out.println("Element found at index: " + result);
		}else {
			System.out.println("Element not found");
		}
	}

}
