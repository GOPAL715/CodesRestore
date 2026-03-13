package streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicExample {
	public static void main(String args[]) {
		List<String> names = Arrays.asList("Gopal","Abhi","Tommy","Edsion");
		
		Stream <String> stream = names.stream();
		
		stream.forEach(name ->System.out.println(name));
		
		List<Integer> nums = Arrays.asList(1,5,4,6,7,8,9,88);
		
		nums.stream().filter(n->n%2==0).map(n->n+2).forEach(n->System.out.println(n));
	
	}

}
