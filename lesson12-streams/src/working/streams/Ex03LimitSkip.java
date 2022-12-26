package working.streams;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03LimitSkip {
	public static void main(String[] args) {
		// collection(list/set) --> .stream() --> stream
		// array --> Arrays.stream(array)
		
		// Primitive stream --> IntStream, Double, LongStream
		// additional --> sum, sub, mul, div, avg
		
		// Object stream --> Stream<T>
		
		int[] numbers = {9, 5, 6, 7, 1, 7, 3, 5};
		
		// Find max 3 elements
		Arrays.stream(numbers) // InStream # Stream<Integer>
			.distinct() // IntStream
			.boxed() // stream<Integer>
			.sorted(Comparator.reverseOrder())
			.limit(3)
			.forEach(System.out::println);
	}	
}
