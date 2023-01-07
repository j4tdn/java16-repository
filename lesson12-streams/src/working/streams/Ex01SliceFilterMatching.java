package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 1, 2, 3, 4);
//		1, Select unique elements -> 1, 2, 3, 4
		numbers.stream().distinct().forEach(System.out::print);
		System.out.println();
// 		2. Select elements which appear once in list -> 3, 4
		// groupBy -> return a map
		// 1 -> 1,1
		// 2 -> 2,2
		// 3 -> 3
		// 4 -> 4
		Map<Integer, List<Integer>> map = numbers.stream().collect(Collectors.groupingBy(number -> number));
		map.entrySet().stream().filter(e -> e.getValue().size() == 1).map(e -> e.getKey()).forEach(System.out::print);
	
		// more brief
		numbers.stream()
			.collect(Collectors.groupingBy(number -> number, Collectors.counting())) // Map<Integer,Long>
			.entrySet()
			.stream()
			.filter(e -> e.getValue() == 1)
			.map(e -> e.getKey())
			.forEach(System.out::print);
	}
}
