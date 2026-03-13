package streamexamples;

import java.util.Arrays;
import java.util.List;

public class ElementsConverting {

	public static void main(String[] args) {
		List<String> list =Arrays.asList("10","20","30");
		list.stream().mapToInt(s->Integer.parseInt(s)).forEach(n->System.out.println("String to int :"+n));
		list.stream().mapToDouble(s->Integer.parseInt(s)).forEach(n->System.out.println("String to Double :"+n));
		list.stream().mapToLong(s->Integer.parseInt(s)).forEach(n->System.out.println("String to Long :"+n));

	}

}
