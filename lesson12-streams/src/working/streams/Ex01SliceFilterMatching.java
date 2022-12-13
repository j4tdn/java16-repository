package working.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,1,3,2,2,4);
		
		// 1. Select unique elements --> 1 2 3 4
		numbers.stream()  //Stream<Integer>
		.distinct()       //Stream<Integer>  -->  equal, hashcode
		.forEach(number -> System.out.print(number + " "));
		// 2. Select elements which appear one time in list --> 4
		// Map<Number, Count>
		// 1 2 
		// 2 3
		// 3 1 
		// 4 1
		Map<Integer, List<Integer>> map = numbers.stream() 
		 // Stream<Integer>
		     .collect(Collectors.groupingBy(number -> number));
		
		System.out.println("\n------");
		// Cách 1
		map.entrySet()
		.stream()
		.filter(e -> e.getValue().size() ==1)
		.forEach(e -> System.out.println(e.getKey()));
		
		System.out.println("===========");
		// Cách 2
		numbers.stream()
		.collect(Collectors.groupingBy(number -> number, Collectors.counting()))  // Map<Integer, long>
		.entrySet()
		.stream()
		.filter(e -> e.getValue() == 1)
		.forEach(e -> System.out.println(e.getKey()));
	}
}
