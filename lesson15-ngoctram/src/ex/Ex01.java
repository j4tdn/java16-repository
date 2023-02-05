package ex;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {
	public static void main(String[] args) {
		Integer[] N = new Integer[] {1, 2, 3, 4, 5, 6, 5, 5, 3, 1};

		Map<Integer, Long> map = Arrays.stream(N)
		.collect(Collectors.groupingBy(number -> number, Collectors.counting()));
		
		System.out.println("Elements appearning once : ");
		map.entrySet().stream()
		.filter((e) -> e.getValue() == 1)
		.forEach((e) -> {
			System.out.print(e.getKey() + " - ");
		});
		
		// =======================
		System.out.println();
		N = new Integer[] { 5, 7, 9, 10, 20, 9, 7, 7, 11};
		System.out.println("Elements appearning more than 1 time : ");
		Arrays.stream(N)
		.collect(Collectors.groupingBy(number -> number, Collectors.counting()))
		.entrySet()
		.stream()
		.filter((e) -> e.getValue() > 1)
		.forEach((e) -> {
			System.out.print(e.getKey() + " - ");
		});
	
	}
}
