package terminaloperation;

import java.util.Arrays;
import java.util.List;

public class ToArrayExample {
	
	public static void main(String[]args) {
		 List<String> electronics = Arrays.asList("bike","airplane","tv","mobile");
		 String []electronicsArray = electronics.stream().toArray(s-> new String[s]);
		 System.out.println(Arrays.toString(electronicsArray));
	}

}
