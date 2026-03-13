package terminaloperation;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
	public static void main(String[] args) {
		List<Integer> sum = Arrays.asList(1,2,3,4);
		int sum1 =sum.stream().reduce(7,(a,b)->a+b);
		System.out.println(sum1);
	}

}
