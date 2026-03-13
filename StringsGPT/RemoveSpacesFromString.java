package com.exam.preparation.gpt;

public class RemoveSpacesFromString {
	
	public static String removeSpace(String str) {
		
		String result ="";
		
		for(int i =0; i<str.length(); i++) {
			
			if(str.charAt(i) != ' ') {
				result = result+str.charAt(i);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String str = "Gopal Gudipati";
		
		System.out.println(removeSpace(str));
		
	}

}
