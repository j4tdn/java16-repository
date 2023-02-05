package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,5,5,3,1);
		List<Integer> numbers2 = Arrays.asList(5,7,9,10,20,9,7,11);
		
		System.out.println("1. Các phần tử chỉ xuất hiện một lần duy nhất trong dãy N");
		numbers1.stream()
			.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue() ==1)
			.forEach(e -> System.out.print(e.getKey() + " "));
		
		System.out.println("\n2. Các phần tử xuất nhiều hơn một lần trong dãy N");
		numbers2.stream()
			.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue() > 1)
		.	forEach(e -> System.out.print(e.getKey() + " "));
	}

}
