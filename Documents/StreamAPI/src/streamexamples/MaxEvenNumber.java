package streamexamples;

import java.util.Arrays;
import java.util.List;

public class MaxEvenNumber {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 45, 64, 88, 75, 96, 32, 58);

        int num = list.stream().filter(n -> n % 2 == 0).max((a, b) -> a.compareTo(b)).get();  
        int num1 = list.stream().filter(n -> n % 2 == 0).min((a, b) -> b.compareTo(a)).get(); 

        System.out.println("Maximum even number: " + num);
        System.out.println("Minimum even number: " + num1);
    }
}
