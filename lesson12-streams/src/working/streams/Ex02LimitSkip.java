package working.streams;

import java.util.Arrays;
import java.util.Comparator;

public class Ex02LimitSkip {
	public static void main(String[] args) {
		//collection(list/set)  -->  .stream() --> stream 
		//array => Arrays.stream(array)
		
		//Primitive Stream: IntStream, Double, LongStream
		//additional --> sum, sub, mul, div, avg
		
		//ObjectStream--> Stream<T>
		int[] numbers = {9, 5, 6, 7, 1, 3, 5};
		
		//Find max 3 elements
		Arrays.stream(numbers).   // Instream # Stream<Integer>
		distinct() //Instream
		.boxed() //Stream<Integer>
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.limit(3).forEach(System.out::println);
		
		
	}

}
