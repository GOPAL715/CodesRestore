package streamexamples;

import java.util.Arrays;
import java.util.List;

public class SkipExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("I","AM", "IN","BANGLORE");
		list.stream().skip(2).forEach(n ->System.out.println(n));

	}

}
