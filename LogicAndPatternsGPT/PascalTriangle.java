package com.exam.preparation.starpatterns.gpt;

public class PascalTriangle {
	
	public static int factorial(int n) {
		
		int fact =1;
		
		for(int i=1; i<=n; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static int combination(int n , int r) {
		return factorial(n) / (factorial(r) * factorial(n -r));
	}
	
	public static void pascalTriangle(int rows) {
		
		for(int i =0; i < rows; i++) {
			
			for( int j =0; j<=i; j++) {
				System.out.print(combination(i,j)+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pascalTriangle(4);
	}

}
