package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		
		// List<Integer>
		// int[] 
		
		List<Integer> numberList = List.of(1, 5 ,7, 2);
		
		Integer sum = numberList.stream()
				.reduce(0, Integer::sum);
		System.out.println("sum --> " + sum);
		
		Integer max = numberList.stream()
				.reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("max --> " + max);
		
		// numberList.stream() // Stream<Integer>
		//		.reduce(0, (n1,n2) -> n1 + n2);
		// 		.reduce(Integer.MIN_VALUE, 
		//			(result, element) -> result < element ? element : result);
		
		
	}
}	
