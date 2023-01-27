package working.streams;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02LimitSkip {
	public static void main(String[] args) {
		// collection (list/set) --> .stream() --> stream
		// array --> Arrays.stream(array)
		//Primitive stream --> integer , double stream
		// additional --> sum , sub , mul , div , avg
		// object stream --> Stream <T>
		
		int[] numbers = {9,5,6,7,1,2,4,7,7};
		
		//find max 3 elements
		
		Arrays.stream(numbers)
			.distinct()
			.boxed()
			.sorted(Comparator.reverseOrder())
			.limit(3)
			.forEach(System.out::println);
	}
}
