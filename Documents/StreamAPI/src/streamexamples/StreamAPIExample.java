package streamexamples;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
	
    public static void main(String[] args)
    {
	List<String> list = new ArrayList<String>();
	list.add("LG");
	list.add("Samsung");
	list.add("Sansui");
	list.add("Signma");
	list.add("Godrej");

	System.out.println(" input : " + list);
	// give me the list of product which starts with S and convert it to upper case

	// 1. Convert the list to Stream object
	Stream<String> stream = list.stream();

	// 2. apply the logic (filter the products which starts with 'S')

	Stream<String> filteredStream = stream.filter(j -> j.startsWith("S")).map(w -> w.toUpperCase());

	// 3. collect the data
	List<String> outPutList = filteredStream.collect(Collectors.toList());

	System.out.println(" output : " + outPutList);
    }


}
