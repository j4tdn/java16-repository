package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		// Find sum, sub, max, min of all element in list, array
		// List<Integer> 
		// int[]
		
		List<Integer> numberList = List.of(1, 5, 7, 2);
		
		Integer sum = numberList.stream() // Stream<Integer>
			// .reduce(0, (result, number) -> result + number);
			//	.reduce(0, Ex01ReduceDemo::sum);
			// .reduce(0, Ex01ReduceDemo::sum);
				.reduce(0, Integer::sum);
		System.out.println("sum --> " + sum);
		
		Integer max = numberList.stream()
				.reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("max --> " + max);
		/*
		 * 
		 */
	}
	
	private static Integer sum(Integer x1, Integer x2) {
		return x1 + x2;
	}
}
