package generic;

import java.util.Arrays;
import java.util.List;

public class Ex03GenericWildCard {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Double> decimals = Arrays.asList(1d, 2d, 55d);
		List<String> sequences = Arrays.asList("a","b","c");
		printf(sequences);
		printf(numbers);
		printf(decimals);
	}
	private static  void printf(List<?> elements) {
		for(Object element: elements) {
			System.out.println(element + "");
		}
		System.out.println();
	}
}
