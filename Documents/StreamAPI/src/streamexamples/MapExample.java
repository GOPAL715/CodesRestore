package streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {

		List<String>names = Arrays.asList("Gopal","Jagannadh", "Seshu");
		
		System.out.println("given names are in these format: "+ names);
		
		Stream<String> mapped= names.stream().map(value -> value.toUpperCase());
		
		System.out.println("By using mapp method: ");
		mapped.forEach(value -> System.out.println(value));
	}

}
