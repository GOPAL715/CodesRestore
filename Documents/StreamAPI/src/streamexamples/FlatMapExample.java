package streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class FlatMapExample {


		public static void main(String[] args) {
			List<List<String>> food = Arrays.asList(Arrays.asList("apple", "Mango", "banana", "imli"),
													Arrays.asList("chicken", "mutton", "biryani"),
													Arrays.asList("Paneer", "sag", "roti"));
			List<String> outPut = food.stream().flatMap(f -> f.stream())
									.filter(item -> item.length() >= 5)
									.collect(Collectors.toList());
			System.out.println(outPut);
		}
	

}
