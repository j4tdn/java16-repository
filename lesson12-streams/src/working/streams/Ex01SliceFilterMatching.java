package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 4);
		
		//1. select unique elements --> 1 2 3 4
		System.out.println("1. select unique elements --> 1 2 3 4");
		numbers.stream()
			   .distinct()
			   .forEach(System.out::println);
		int[] a = new int[100];
		
		//2. select elements appear one time in list --> 3 4
		System.out.println("2. select elements appear one time in list --> 3 4");
		numbers.stream()
			   .collect(Collectors.groupingBy(number -> number, Collectors.counting()))
			   .entrySet()
			   .stream()
			   .filter(e -> e.getValue() == 1)
			   .forEach(e -> System.out.println(e.getKey()));
	}
}
