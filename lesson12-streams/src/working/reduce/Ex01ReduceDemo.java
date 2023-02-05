package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {

	public static void main(String[] args) {
		// int[]
		// List<Integer>

		List<Integer> numberList = List.of(1, 2, 8, 7);
		Integer max = numberList.stream()
				.reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("max : " + max);

	}

}
