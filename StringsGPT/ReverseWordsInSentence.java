package com.exam.preparation.gpt;

public class ReverseWordsInSentence {
	
	public static String reverseSentence(String str) {
		
		String words[] = str.split(" ");
		
		String result ="";
		
		for(int i = words.length-1; i>=0;i-- ) {
			result = result+words[i]+" ";
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String str = "Surya Gopal Gudipati";
		
		System.out.println(reverseSentence(str));
	}

}
