package com.exam.preparation.starpatterns.gpt;

public class FloydTriangle {
	
	public static void floydTriangle(int n) {
		
		int num =1;
		
		for(int i =1; i<=n; i++) {
			
			for( int j =1; j <=i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		floydTriangle(4);
	}

}
