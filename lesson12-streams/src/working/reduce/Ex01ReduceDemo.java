package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		// int[], 
		// List<Integer>
		
		List<Integer> numberList = List.of(1,8,7,2);
		Integer sum = numberList.stream()
				// reduce(0, (result, number) -> result + number);
				.reduce(0, Integer::sum);
		System.out.println("sum --> " + sum);
		
		Integer max = numberList.stream()
				.reduce(Integer.MIN_VALUE, Integer::max);
		        // reduce(0, (max, element) -> max < element ? element : max);
		System.out.println("max --> " + max);

	}
}
