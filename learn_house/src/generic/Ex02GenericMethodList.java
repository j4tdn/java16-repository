package generic;

import java.util.Arrays;
import java.util.List;

public class Ex02GenericMethodList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		List<Double> decimals = Arrays.asList(1d, 2d, 55d);
		
		printf(numbers);
		printf(decimals);
	}
	private static <T extends Number> void printf(List<T> elements) {
		for(T element: elements) {
			System.out.println(element + "");
		}
		System.out.println();
	}

}
