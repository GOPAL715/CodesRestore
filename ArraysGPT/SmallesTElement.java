package com.exam.preparation.chatgpt;

public class SmallesTElement {
	
	public static void minELement(int arr[]) {
		
		int min = Integer.MAX_VALUE;
		int sMin = Integer.MAX_VALUE;
		
		for(int i=0; i< arr.length;i++) {
			if(arr[i]<min) {
				sMin = min;
				min=arr[i];
			}
			else if(arr[i] < sMin && arr[i] != min) {
				sMin = arr[i];
			}
		}
		
		System.out.println("Minimum element: "+ min);
		System.out.println("Second Minimum element: "+ sMin);
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {74,2,3,45,69};
		
		minELement(arr);
	}

}
