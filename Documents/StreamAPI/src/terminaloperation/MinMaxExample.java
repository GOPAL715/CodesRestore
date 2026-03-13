package terminaloperation;

import java.util.Arrays;
import java.util.List;

public class MinMaxExample {
	
	public static void main(String[] args) {
		List<Integer> nums =Arrays.asList(2,56,86,96,54);
		int minValue=nums.stream().min((a,b)->a-b).get();
		int maxValue=nums.stream().max((a,b)->a-b).get();
		System.out.println(minValue);
		System.out.println(maxValue);
		
	}

}
