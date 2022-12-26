package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 4);
		
		// 1. Select unique elements --> 1 2 3 4
		numbers.stream() // stream<Integer>
			.distinct()  // stream<Integer>
			.forEach(number -> System.out.println(number + ", "));
		
		
		// 2. Select elements which is not duplicate in list
		System.out.println("Cach 1");
		// Cách 2
		// Map<Integer, List<Integer>>
		// 1 -> 1, 1
		// 2 -> 2, 2
		// 3 -> 3
		// 4 -> 4
		Map<Integer, List<Integer>> map = numbers.stream()
				.collect(Collectors.groupingBy(number -> number));
		
		map.entrySet() // Entry<Integer, List<Integer>>
			.stream()
			.filter(e -> e.getValue().size() == 1)
			.forEach(e -> System.out.println(e.getKey()));
		
		
		System.out.println("Cach 2");
		// Cách 2
		// Map<Integer, Long>
		// 1 -> 2
		// 2 -> 2
		// 3 -> 1
		// 4 -> 1
		
		numbers.stream()
			.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e -> e.getValue() == 1)
			.forEach(e -> System.out.println(e.getKey()));
		
		
		
	}
}
