package woking.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,1,2,3,2,4);
		
		// 1. Select unique elements --> 1, 2, 3, 4
		number.stream().distinct().forEach(o-> System.out.print(o + " "));
		// 2. Select elements which appear one time in list --> 3, 4
		System.out.println();
		number.stream()
			.collect(Collectors.toMap(o->o, o->o, (o1,  o2) -> o1 + o2, HashMap::new))
			//.collect(Collectors.groupingBy(numbers->numbers, Collects.counting()))
			.entrySet()
			.stream()
			.filter(o-> o.getKey() == o.getValue())
			.forEach(c -> System.out.print(c.getKey() + " "));
		
	}
}
