package view;

import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.*;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		
		System.out.println("Cau 1: ");
		numbers.stream().collect(groupingBy(number -> number, counting()))
		.entrySet()
		.stream()
		.filter(number -> number.getValue() == 1)
		.forEach(s -> System.out.println(s.getKey()));
		
		System.out.println("Cau 2: ");
		numbers.stream().collect(groupingBy(number -> number, counting()))
		.entrySet()
		.stream()
		.filter(number -> number.getValue() > 1)
		.forEach(s -> System.out.println(s.getKey()));
	}
}
