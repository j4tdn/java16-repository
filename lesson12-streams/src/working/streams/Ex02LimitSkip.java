package working.streams;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02LimitSkip {
	public static void main(String[] args) {
		// collection(list/set) --> .stream()
		// array --> Arrays.stream(array)
		// Primitive stream --> IntStream, DoubleStream, LongStream
		// additional --> sum, mul, div, avg
		int[] numbers = {9, 5, 6, 7, 1, 3, 7, 5};
		
		// Find max 3 elements 
		Arrays.stream(numbers)
			.distinct()
			.boxed()
			.sorted(Comparator.reverseOrder())
			.limit(3)
			.forEach(System.out::println);
	}
}
