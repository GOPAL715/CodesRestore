package com.kodewala.strings;

public class MethodsInString {

	public static void main(String[] args) {
		
		System.out.println("Method 1 : String Concantation");
		System.out.println("");
	
		String s1 =" Gopal";
		String s2 =" Gudipati";
		String s3 ="Surya";
		
		
		String s4 = s1 + s2;
		String s5 = s3.concat(s4);
		System.out.println("Example for String Concatention using plus operator s4 is: "+ s4);
		System.out.println("Example for String Concatention using Concat() method s5 is: "+ s5);
		System.out.println("");
		
		System.out.println("Method 2:  Length and Character Access: ");
		System.out.println("");
		
		System.out.println("Example for Length method : "+ s1.length());
		System.out.println("Example for finding character in string at mention location: "+ s1.charAt(1));
		
		System.out.println("Method 3 for String Comparsion: ");
		System.out.println("");
		
		String s6 = "Kaikalur";
		String s7 = "KAIKALUR";
		
		System.out.println("Example of (equals method) of s6 is equals to s7 : "+ s6.equals(s7));
		System.out.println("Example of (equalsIgnoreCase) of  s6 is compare to s7: "+ s6.equalsIgnoreCase(s7));
		System.out.println("");
		
		System.out.println("Methods 4 for Searching and SubStrings");
		System.out.println("");
		System.out.println("Example of (indexOf) method is searching for the character and its index :" + s1.indexOf("a"));
		System.out.println("Example of (lastIndexOf) method is last occurance index of a string :" + s2.lastIndexOf("i"));
		System.out.println("Example of (subStrring.(int beginIndex)) method is print after substring from the given index of String s1:  "+ s1.substring(3));
		System.out.println("Example of (SubString.(int beginIndex , int endIndex)) method is Substring from the begining index and end index is: "+ s3.substring(0, 5));
		System.out.println("");
		
		System.out.println(" Method 5 for String Modification: ");
		System.out.println("");
		System.out.println("Example for converting the string into uppercase (toUpperCase()) method is: "+s3.toUpperCase());
		System.out.println("Example for converting the string into lowercase (toLowerCase()) method is: "+s3.toLowerCase());
		System.out.println("Example for Triming(.trim) method means remove unwanted Spaces from the String is: "+s1.trim());
		System.out.println("Example for replace(old char, new char) for replacing old one to new character: "+s1.replace('G','B'));
		System.out.println("");
		
		System.out.println("Method 6 : Splitting : ");
		System.out.println("");
		String s8= "Gopal,Lives,In,Bengaluru";
		String [] locations = s8.split(",");
		
		for(int i =0;i<locations.length;i++) {
			System.out.println("Example for Splitting in the string into array of substrings based on the delimeter: "+locations[i]);
		}
		System.out.println("");
		
		System.out.println("Method 7 : Checking String Content ");
		System.out.println("");
		System.out.println("Example for (.contains(CharSequence s) method checks the string contains a given Sequence ) : "+ s5.contains("Gopal"));
		System.out.println("Example for (.startsWith(String Prefix) method checks the string starts with a given Sequence) : "+ s5.startsWith("Surya"));
		System.out.println("Example for (.endsWith(String Prefix) method checks the string ends with a given Sequence) : "+ s5.endsWith("Gudipati"));
		System.out.println("");
		
		System.out.println("Method 8 : Conversions :");
		System.out.println("");
		char []chars =s1.toCharArray();
		for(int i =0;i<chars.length;i++) {
			System.out.println("Example for (.toCharArray()) method is converts the string to a character array :"+chars[i]);
			
		}
		
		
		
	}

}
