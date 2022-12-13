package working.streams;

import java.util.Arrays;
import java.util.List;


public class Ex01SliceFilterMatching {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,2,2,3,4);
		// 1 . select unique elements --> 1 2 3 4
	    numbers.stream().distinct().forEach(o -> System.out.print(o + " "));
		// 2 . select elements which appear one time in list --> 3 4 
	    System.out.println();
		numbers.stream().filter(o -> count(numbers, o) == 1).forEach(o -> System.out.print(o + " "));
//		System.out.println(" =========== ");
//		numbers.stream()
//		.collect(Collectors.groupingBy(number -> number , Collectors.counting()))
//		.entrySet()
//		.stream()
//		.filter(e -> e.getValue() == 1)
//		.forEach(e -> System.out.println(e));
	}

	private static int count(List<Integer> list, int count) {
		return (int) list.stream().filter(o -> o == count).count();
	}
}
