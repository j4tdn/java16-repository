package view;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex01 {
	static int[] arrNumbers = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };

	public static void main(String[] args) {
		Map<Integer, Integer> uniNumbers = new HashMap<>();
		System.out.println("1. Liệt kê các phần tử chỉ xuất hiện một lần duy nhất trong dãy N");
		distinct(uniNumbers).entrySet().stream().filter(element -> element.getValue() == 1)
				.map(element -> element.getKey()).collect(Collectors.toList())
				.forEach(element -> System.out.print(element + " "));

		System.out.println("\n");
		
		System.out.println("2. Liệt kê các phần tử xuất nhiều hơn một lần trong dãy N \n");
		distinct(uniNumbers).entrySet().stream().filter(element -> element.getValue() > 1)
				.map(element -> element.getKey()).collect(Collectors.toList())
				.forEach(element -> System.out.print(element + " "));
	}

	public static Map<Integer, Integer> distinct(Map<Integer, Integer> maps) {
		Map<Integer, Integer> uniNumbers = new HashMap<>();
		for (int i = 0; i < arrNumbers.length; i++) {
			if (uniNumbers.containsKey(arrNumbers[i])) {
				uniNumbers.put(arrNumbers[i], 2);
			} else {
				uniNumbers.put(arrNumbers[i], 1);
			}
		}
		return uniNumbers;
	}

}
