package streamexamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassExample {

    public static void main(String[] args) {
        List<String> name = Arrays.asList("Surya Gopal", "Tenim Rout", "Akash A","Gopal", "Govind", "Jamon", "Rahul kumar", "Abhi");

        List <String> result =name.stream().filter(n -> n.length() > 5) .distinct().collect(Collectors.toList()); 
        System.out.println(result);
    }
}
