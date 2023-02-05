package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		List<Integer> numbersList = List.of(1,5,2,7);
		Integer sum = numbersList.stream()
		.reduce(0, (result, element)-> result + element);//stream<Integer>
		System.out.println(sum);
		Integer max = numbersList.stream()
				.reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(max);
	}
	
}
