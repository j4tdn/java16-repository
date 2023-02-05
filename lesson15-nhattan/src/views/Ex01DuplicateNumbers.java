package views;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex01DuplicateNumbers {
	public static void main(String[] args) {
		System.out.println("Các phần tử chỉ xuất hiện một lần trong dãy: ");
		int[] numbers = {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};
		
		Arrays.stream(numbers)
			  .boxed()
			  .collect(Collectors.groupingBy(number -> number))
			  .entrySet()
			  .stream()
			  .filter(e -> e.getValue().size() == 1)
			  .forEach(e -> System.out.println(e.getValue()));
		
		System.out.println("Các phần tử xuất hiện nhiều hơn một lần trong dãy N");
		Arrays.stream(numbers)
			.boxed()
			.collect(Collectors.groupingBy(number -> number))
			.entrySet()
			.stream()
			.filter(e -> e.getValue().size() != 1)
			.forEach(e -> System.out.println(e.getKey()));
	}
	
}