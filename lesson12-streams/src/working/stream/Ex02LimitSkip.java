package working.stream;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02LimitSkip {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,6,5,4,4,7,8,9,1,3};
		Arrays.stream(numbers)
		.distinct()
		.boxed()
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.forEach(System.out::println);
	}

}
