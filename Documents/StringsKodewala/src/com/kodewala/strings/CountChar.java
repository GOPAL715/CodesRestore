package com.kodewala.strings;

public class CountChar {

	public static void main(String[] args) {
		   String s1 = "I am from Bangalore Karnataka";

	        char[] chars = s1.toCharArray();
	        int count = 0;

	        for (int i =0;i<chars.length;i++) {
	        	if (chars[i] != ' ') {   
	                count++;
	            }
	        }

	        System.out.println("Total characters count in the chars: " + count);
	}

}
