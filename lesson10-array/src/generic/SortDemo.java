package generic;

import java.util.Arrays;

import common.Tuple;

public class SortDemo {
	public static void main(String[] args) {
		String[] sequences = {"A", "B"};
		// X[] --? X implements Comparale<X>
		Arrays.sort(sequences);
		System.out.println(Arrays.toString(sequences));
		
		Tuple[] tuples = {new Tuple(100, 1), new Tuple(2, 20)};
		sort(tuples);
		System.out.println("tuples --> " +Arrays.toString(sequences));
		System.out.println("tuples --> " +Arrays.toString(tuples));
	}
	// extends comparable de bat loi
	private static <E extends Comparable<E>> void sort(E[] el) {
		Arrays.sort(el);
	}
}
