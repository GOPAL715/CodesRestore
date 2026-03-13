package terminaloperation;

import java.util.LinkedList;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectExample {
	public static void main(String[] args) {
		List<String> list = Stream.of("A","B","C").collect(Collectors.toList());
		System.out.println(list);
		
		Set<String> set = Stream.of("A","B","C").collect(Collectors.toSet());
		System.out.println(set);
		
		LinkedList<String> linkedList = Stream.of("A","B","C").collect(Collectors.toCollection(()->new LinkedList<>()));
		System.out.println(linkedList);
		
		String joined =Stream.of("Kodewala","Bangalore").collect(Collectors.joining(", "));
		System.out.println(joined);
		
		long count =Stream.of("A","B","C").collect(Collectors.counting());
		System.out.println(count);
		
		Map<Integer, List<String>> grouped = Stream.of("one","two","three","four").collect(Collectors.groupingBy(s->s.length()));
		System.out.println(grouped);
		
		Map<Boolean, List<Integer>> partitioned =Stream.of(1,2,3,4,5).collect(Collectors.partitioningBy(n -> n% 2==0));
		System.out.println(partitioned);
		
	}

}
