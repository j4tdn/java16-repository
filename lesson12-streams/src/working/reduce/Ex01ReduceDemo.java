package working.reduce;

import java.util.List;

public class Ex01ReduceDemo {
	public static void main(String[] args) {
		List<Integer> numberlist = List.of(1, 5, 7, 2);
		
		Integer sum = numberlist.stream()
			.reduce(0, Integer::max);
		System.out.println(sum);
	}
}
