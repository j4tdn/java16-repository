package generic;

import java.util.Arrays;

import common.Tuple;

public class SortDemo {
	public static void main(String[] args) {
		
		
		Tuple[] tuples = {new Tuple(1, 10),
				          new Tuple(2, 20),
				          new Tuple(3, 30),
		};
		sort(tuples);
		System.out.println(Arrays.toString(tuples));
		
	
	}
	private static <E extends Comparable<E>> void sort(E[] elementData) {
		Arrays.sort(elementData);
	}

}
