package terminaloperation;

import java.util.Arrays;
import java.util.List;

public class CountExample {
	public static void main(String[] args) {
		List<String> names =Arrays.asList("Bangalore","Hyd","Chennai","Ahm");
		long count=names.stream().count();
		
		System.out.println(count);
	}

}
