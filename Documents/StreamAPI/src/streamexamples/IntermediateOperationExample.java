package streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationExample {
	public static void main(String[] args) {
		
		//Filter method Example
		List<String> words = Arrays.asList("Hi", "Java", "Go", "Coding", "AI");
		
		Stream<String> output=words.stream().filter(word -> word.length()>=3);
	
		output.forEach(word ->System.out.println(word));
		
		
		
		}
	

}
