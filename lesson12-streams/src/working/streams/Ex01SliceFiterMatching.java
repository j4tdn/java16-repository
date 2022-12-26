package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex01SliceFiterMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,2,2,3,4);
		
		// 1. Select unique elements
		numbers.stream()
			.distinct()
			.forEach(number -> System.out.print(number + ", "));
		
		// 2. Select elements which appear one time in list --> 3,4
		Map<Integer , List<Integer>> map = numbers.stream()
				.collect(Collectors.groupingBy(number -> number));
		
		map.entrySet()
		.stream()
		.filter(e -> e.getValue().size() == 1)
		.forEach(e -> System.out.println(e.getKey()));
		
		// Cach 2
		
		numbers.stream()
				.collect(Collectors.groupingBy(number -> number , Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() == 1)
				.forEach(e -> System.out.println(e.getKey()));
	}
}
