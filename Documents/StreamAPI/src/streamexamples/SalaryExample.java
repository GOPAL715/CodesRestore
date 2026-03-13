package streamexamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class SalaryExample {

	public static void main(String[] args) {
		 List<Integer> salary = Arrays.asList(231000,34354,1000,43563,689879);
		int secondHighestSalary = salary.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second Highest Salary : "+ secondHighestSalary);

	}

}
