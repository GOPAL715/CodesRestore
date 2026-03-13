package com.kodewala.strings;

public class InternExample {

	public static void main(String[] args) {
		String s1  = "Lenovo";
		String s2 = new String("Lenovo");
		
		System.out.println("s1==s2 is : "+ s1==s2 );
		System.out.println("s1.equals(s2) is : "+ s1.equals(s2) );
	
		s2 = s2.intern();
		System.out.println( s1==s2 );
		

	}

}
