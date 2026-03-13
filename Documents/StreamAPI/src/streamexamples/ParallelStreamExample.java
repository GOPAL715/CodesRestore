package streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class ParallelStreamExample {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Mohith", "Murali","Abhishek","Venkat","Abhi");
		
		List<String> result = list.stream()
				.filter(l->l.length()> 5)
				.map(l->l.toUpperCase())
				.sorted()
				.collect(Collectors.toList());
		result.forEach(l->System.out.println(l));
		
		System.out.println("Example for Parallel Stream Output");
		list.parallelStream().forEach(l->System.out.println(Thread.currentThread().getName()+ " - " + l));
		System.out.println(ForkJoinPool.commonPool().getParallelism()); 

	}

}
