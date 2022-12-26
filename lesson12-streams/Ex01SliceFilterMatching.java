package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 4);

		// 1. select unique elements --> 1 2 3 4
		numbers.stream() // Stream<Interger>
				.distinct() // Stream<Interger> --> hashCode, equals
				.forEach(number -> System.out.println(number + ", "));
		// 2. Select elements which appear one time in list --> 3 4
		// C1:
		Map<Integer, List<Integer>> map = numbers.stream() // Stream<Integer>
				.collect(Collectors.groupingBy(number -> number));
		map.entrySet()
		.stream()
		.filter(e -> e.getValue().size() == 1)
		.forEach(e -> System.out.println(e.getKey()));

		// C2:
		// Map<Integer, Long>
		// 1 -> 1
		// 2 -> 2
		// 3 -> 1
		// 4 -> 1
		numbers.stream()
		.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e -> e.getValue() == 1)
		.forEach(e -> System.out.println(e.getValue()));

	}
}
