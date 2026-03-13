package streamexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
	public static void main(String[] args) {
		List<String>list= Arrays.asList("Banana","Apple","Cherry","Dazzle");
		list.stream().sorted().forEach(value -> System.out.println("Sorted: "+ value));//Sorting example
		
		List<String> names =Arrays.asList("Gopal G", "Akash A","Tenim R","Jamon M","Rahul K");
		names.stream()
	    .sorted((s1, s2) -> s1.length() - s2.length())
	    .forEach(v -> System.out.println("Sorted by length: " + v));//Custom Sorting by lengthS

		
		

	}

}
