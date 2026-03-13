package streamexamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer>list =Arrays.asList(1,2,3,1,4,2,5,3,5,6,3,2,1,5,6);
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> duplicates =list.stream().filter(number ->!set.add(number)).collect(Collectors.toSet());
		System.out.println("Duplicates are: "+duplicates);
	
	}
}
