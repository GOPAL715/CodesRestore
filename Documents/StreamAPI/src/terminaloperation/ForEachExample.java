package terminaloperation;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		
		List<String> places = Arrays.asList("BTM Layout","Marathahalli","Bellanduru");
		places.stream().forEach(place->System.out.println(place));

	}

}
