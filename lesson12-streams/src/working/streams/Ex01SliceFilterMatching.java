package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,2,3,3,4,2);
		
		// 1. Select unique elements --> 1234
		numbers.stream()
		.distinct()
		.forEach(number-> System.out.print(number + " "));
		
		// 2. Select element which appear one time in list --> 34
		// C1:
		Map<Integer, List<Integer>> map = numbers.stream()
		.collect(Collectors.groupingBy(number -> number));
		map.entrySet()
		.stream()
		.filter(e-> e.getValue().size() == 1)
		.forEach(e-> System.out.println(e.getKey()));
		
		//C2:
		numbers.stream()
		.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e-> e.getValue()==1)
		.forEach(e-> System.out.println(e.getKey()));
	}
}
