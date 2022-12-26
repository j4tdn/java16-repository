package working.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Ex02LimitStream {
	public static void main(String[] args) {

		// collection (list/set) --> .stream() --> stream
		// array --> Arrays.stream(array)
		// Primitive Stream --> IntStream, Double, LongStream 
		// additional --> sum, sub, mul, div, avg
		
		// Object stream --> Stream<T>
		
		int[] numbers = {9,9,4,1,7,3,5,8,3};
		// find max 3 elements
		
		Arrays.stream(numbers)     // IntStream # Stream<Integer>
		.distinct() // IntStream
		.boxed()    // Stream<Integer>
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.forEach(System.out::println);
	}
}
