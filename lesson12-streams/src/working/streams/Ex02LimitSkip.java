package working.streams;

import java.util.Arrays;

public class Ex02LimitSkip {

	public static void main(String[] args) {
		//collection(list/set) --> .stream() --> stream
		//array --> Arrays.stream(array)
		
		//Primitive stream --> IntStream, Double, LongStream
		//additional --> sum, sub, mul, div, avg
		//Object stream --> Stream
		
		Integer[] numbers = {9, 5, 6, 7, 1, 3, 5};
		
		// Find max 3 elements
		Arrays.stream(numbers)
		.distinct()
		.sorted()
		.limit(3)
		.forEach(System.out::println);
	}
}
