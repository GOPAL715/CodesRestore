package streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupWordExample {

	public static void main(String[] args) {
		
//		List<String> words =Arrays.asList("Bangalore","Mumbai", "Hyd", "Ahm", "Delhi","Mangalore");
//		List <String> result =words.stream().filter(w -> w.length() == 9) .collect(Collectors.toList());
//		List <String> result1 =words.stream().filter(w -> w.length() == 5) .collect(Collectors.toList());
//		List <String> result2 =words.stream().filter(w -> w.length() == 3) .collect(Collectors.toList());
//		
//		System.out.println("For 9 letters in word: "+result);
//		System.out.println("For 5 letters in word: "+result1);
//		System.out.println("For 3 letters in word: "+result2);
		
		Map<Integer,List<String>>grouped =Stream.of("Bangalore","Mumbai", "Hyd", "Ahm", "Delhi","Mangalore").collect(Collectors.groupingBy(s ->s.length()));
		System.out.println(grouped);
	}
	

}
