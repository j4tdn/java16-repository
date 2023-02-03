package generic;

import java.util.Arrays;

import common.Tuple;

public class SortDemo {
	public static void main(String[] args) {
		String[] sequence = { "A", "B" };
		
		// sequence extends from Comparable -> compareTo
		Arrays.sort(sequence);
		System.out.println(Arrays.toString(sequence));

		Tuple[] tuples = { new Tuple(1, 19), new Tuple(2, 20) };
		Arrays.sort(tuples);
		System.out.println(Arrays.toString(tuples));
	}
	
	@SuppressWarnings("unused")
	private static <E extends Comparable<E>> void sort(E[] o) {
		Arrays.sort(o);
	}
}
