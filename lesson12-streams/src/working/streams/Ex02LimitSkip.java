package working.streams;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02LimitSkip {
	public static void main(String[] args) {
		// collection -> .stream()
		// array -> Arrays.stream(arr);

		// find max 3 elements
		int[] numbers = { 9, 5, 6, 7, 2, 5, 7, 3, 8, 9, 9 };
		Arrays.stream(numbers)
		.boxed()
		.sorted(Comparator.reverseOrder())
		.distinct()
		.limit(3)
		.forEach(System.out::println);

	}
}
