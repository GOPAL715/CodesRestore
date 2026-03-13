package com.exam.preparation.gpt;

public class MatrixAddition {
	
	public static void addMatrix(int a[][], int b[][]) {
		
		int rows = a.length;
		int cols = a[0].length;
		
		int result[][] = new int [rows][cols];
		
		for(int i =0; i < rows; i++) {
			
			for(int j=0; j< cols; j++) {
				
				result[i][j] = a[i][j]+ b[i][j];
			}
		}
		
		for(int i =0; i<rows;i++) {
			for(int j =0; j< cols; j++) {
				System.out.print(result[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int a[][] = {{1,2},{3,4}};
		
		int b[][] = {{5,6},{7,8}};
		
		addMatrix(a, b);
	}

}
