package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> numbers =  Arrays.asList(1,1,2,2,3,4);
		//1. Select unique element -> 1,2,3,4
		numbers.stream() //Stream<Integer>
		.distinct()
		.forEach(number -> System.out.print(number + " "));
		
		//2. Select elements which appear one time -> 4
		System.out.println("---------------");
		Map<Integer, List<Integer>> map = numbers.stream()
		.collect(Collectors.groupingBy(number -> number));
		
		map.entrySet() //Entry<Integer, List<Integer>>
		.stream()
		.filter(e -> e.getValue().size() == 1)
		.forEach(e -> System.out.println(e.getKey()));
		
		//c2
		numbers.stream()
		.collect(Collectors.groupingBy(number -> number, Collectors.counting())) //Map<Integer, Long>
		.entrySet()
		.stream()
		.filter(e-> e.getValue() == 1)
		.forEach(e -> System.out.println(e.getKey()));
		
	}

}
