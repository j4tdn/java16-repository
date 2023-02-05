package working.streams;

import java.util.Arrays;

public class Ex02LimitSkip {
	public static void main(String[] args) {
		int [] numbers = { 9, 5,6 ,7 ,1,2,4,7,5,6};
		Arrays.stream(numbers)
		.boxed()
		.distinct()
		.sorted((o1,o2) -> (o2 - o1))	
		.limit(10)
		.forEach(o -> System.out.println(o));
	}

}
