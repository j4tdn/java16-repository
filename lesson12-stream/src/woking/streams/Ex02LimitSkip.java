package woking.streams;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02LimitSkip {
	public static void main(String[] args) {
		
		int[] numbers = {9, 5, 6, 7, 1, 3, 5};
		
		Arrays.stream(numbers)
			.boxed()
			.sorted(Comparator.reverseOrder())
			.limit(10)
			.forEach(System.out::print);
		// Find max 3 elements
	}
}
