package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 4);
		// 1. Select unique elements --> 1 2 3 4
		numbers.stream().distinct().forEach(System.out::print);// hashCode(), equals()
		System.out.println();
		// 2. Select elements which appear one time in list --> 1 2 3 4
		Map<Integer, List<Integer>> map = numbers.stream().collect(Collectors.groupingBy(number -> number));
		map.entrySet() // Entry<Integer, List<Integer>>
				.stream().filter(e -> e.getValue().size() == 1).forEach(e -> System.out.print(e.getKey()));
		System.out.println();
		numbers.stream().collect(Collectors.groupingBy(number -> number, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() == 1).forEach(e -> System.out.print(e.getKey()));
	}
}
