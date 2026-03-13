package streamexamples;

import java.util.List;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
	
	public static void main(String[] args) {
		String s1="Book";
		
		Character firstNonRepeatingChar = s1.chars().mapToObj(s-> (char)s).filter(s->s1.indexOf(s)== s1.lastIndexOf(s)).findFirst().orElse(null);
		
		Character secondNonRepeatingChar = s1.chars().mapToObj(s-> (char)s).filter(s->s1.indexOf(s)== s1.lastIndexOf(s)).skip(1).findFirst().orElse(null);
		
		List<Character> firstNonRepeatingCharacters = s1.chars().mapToObj(s-> (char)s).filter(s->s1.indexOf(s)== s1.lastIndexOf(s)).collect(Collectors.toList());
	
		System.out.println("First non repeating char : "+firstNonRepeatingChar);
		
		System.out.println("Second non repeating char : "+secondNonRepeatingChar);
		
		System.out.println("First non repeating characters : "+firstNonRepeatingCharacters);
	}
	

}
