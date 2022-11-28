package generic;

import java.util.Arrays;

import common.Tuple;

public class SortDemo {
	public static void main(String[] args) {
		String[] sequences = {"A", "B"};
		Arrays.sort(sequences);
		System.out.println(Arrays.toString(sequences));
		Tuple[] tuple = {new Tuple(1,10), new Tuple(2,20)};
		Arrays.sort(tuple);
		System.out.println(Arrays.toString(tuple));
	}
	
	private static <E extends Comparable<E>> void sort(E[] elementData) {
		Arrays.sort(elementData );
	}

}
