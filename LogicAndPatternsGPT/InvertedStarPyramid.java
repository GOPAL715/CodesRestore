package com.exam.preparation.starpatterns.gpt;

public class InvertedStarPyramid {
	
	public static void invertedStarPyramid(int n) {
		
		for( int i = n; i >=1;i--) {
			
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		invertedStarPyramid(4);
	}

}
