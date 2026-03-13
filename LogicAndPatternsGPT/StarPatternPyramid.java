package com.exam.preparation.starpatterns.gpt;

public class StarPatternPyramid {
	
	public static void printStarPyramid(int n) {
		
		for(int i =1; i <= n; i++) {//outer loop (Rows)
			
			// i = row number 
			// n = total rows
			
			//columns
			for(int j =1; j <= n-i; j++) { //first inner loop(for spaces)
				System.out.print(" "); //This prints spaces before stars to make the pyramid centered.
			}	// formula:  spaces(n-i) 3, 2, 1, 0
			
			for(int k =1; k <= (2*i-1); k++) { //Second Inner loop (for Stars)
				System.out.print("*"); // This prints the stars in each row
			}// formula : Stars(2*i-1) = 1, 3, 5, 7
			
			System.out.println();
		}
	}
	
	public static void main(String [] args) {
		printStarPyramid(4);
	}

}
