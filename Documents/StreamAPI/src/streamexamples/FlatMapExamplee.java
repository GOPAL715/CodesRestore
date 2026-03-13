package streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExamplee {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Banglore", " I am Rich", " King");
		
		Stream <String >game =list.stream().flatMap(sentence-> Arrays.stream(sentence.split("")));
		
		game.forEach(sentence -> System.out.println(sentence));
		
		List<String> numbers =Arrays.asList("one","Two", "one", "Three");
		
		System.out.println(numbers.stream().distinct().collect(Collectors.toList()));//distinct
		
		numbers.stream().limit(3).forEach(element ->System.out.println(element));//limit
		
		Stream <String> peekExample=numbers.stream().peek(value->System.out.println("Peeking: "+ value));
		
		peekExample.forEach(value->System.out.println("Final: "+value));//peek
		
	}

}
