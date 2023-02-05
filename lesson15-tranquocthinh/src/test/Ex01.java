package test;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("===== Các phần tử xuất hiện 1 lần trong dãy =====");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		numbers.stream()
			   .collect(groupingBy(number -> number, counting()))
			   .entrySet()
			   .stream()
			   .filter(s -> s.getValue() == 1)
			   .forEach(s -> System.out.print(s.getKey() + " "));
		System.out.println();
		
		System.out.println("===== Các phần tử xuất hiện nhiều lần trong dãy =====");
		List<Integer> numbers2 = Arrays.asList(5, 7, 9, 10, 20, 9, 7, 7, 11);
		numbers2.stream()
			   .collect(groupingBy(number -> number, counting()))
			   .entrySet()
			   .stream()
			   .filter(s -> s.getValue() > 1)
			   .forEach(s -> System.out.print(s.getKey() + " "));
	}
}
