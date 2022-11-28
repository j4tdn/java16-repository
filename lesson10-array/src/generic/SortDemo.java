package generic;

import java.util.Arrays;

import common.Tuple;

public class SortDemo {
	public static void main(String[] args) {
		String[] sequence = { "A", "B" };

		Arrays.sort(sequence);
		System.out.println(Arrays.toString(sequence));
		Tuple[] tuples = { new Tuple(1, 100), new Tuple(2, 20) };
		sort(tuples);
		System.out.println("tuples ---> " + Arrays.toString(sequence));

	}

	private static <E extends Comparable<E>> void sort(E[] elementData) {
		Arrays.sort(elementData);
	}
}
