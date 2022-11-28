package generic;

import java.util.Arrays;

import common.Tuple;

public class SortDemo {
	public static void main(String[] args) {
		String[] sequents = { "A", "B" };

		Arrays.sort(sequents);
		System.out.println(Arrays.toString(sequents));

		Tuple[] tuple = { new Tuple(1, 10), new Tuple(2, 20) };
		sort(tuple);
		System.out.println(Arrays.toString(tuple));
	}

	private static <E extends Comparable<E>> void sort(E[] elementData) {
		Arrays.sort(elementData);
	}

}
