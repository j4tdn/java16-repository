package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,1,2,3,4);
		number.stream()
		.distinct().forEach(n -> System.out.print(n + ","));
		Map<Integer, List<Integer>> map = number.stream()
				.collect(Collectors.groupingBy(n -> n ));
		map.entrySet().stream().filter(e -> e.getValue().size() == 1)
		.forEach(e -> System.out.println(e.getKey()));
	}
	// 1 select uni
	

}
