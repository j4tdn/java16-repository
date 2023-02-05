package working.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Ex03LimitSkip {
	public static void main(String[] args) {
		// collection --> .stream() --> stream
		// array --> Arrays.stream(array)
		// Primitive stream --> IntStream , Double, LongStream
		// additional --> sum, sub, mul, div, avg
		// Object stream --> Stream<T>

		int[] numbers = { 9, 5, 6, 7, 1, 3, 7, 5 };

		// Find max 3 element
		Arrays.stream(numbers) // IntStream#Stream<Integer>
				.distinct() //IntStream
				.boxed() //Stream<Integer>
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.forEach(System.out::println);

	}
}
