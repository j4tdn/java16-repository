package generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import common.Tuple;

public class SortDemo {
	
	

	public static void main(String[] args) {
		String[] sequences = {"A", "B"};
		Arrays.sort(sequences);
		System.out.println("sequences : " + Arrays.toString(sequences));
		
		Tuple[] tuples = {new Tuple(1, 10) , new Tuple(2, 20)};
		Arrays.sort(tuples);
		System.out.println("tuples : " + Arrays.toString(tuples));
		sort(tuples);

		
	}
	
	
	
	private static <E extends Comparable<E>> void sort(E[] a) {
		
		Arrays.sort(a);
	}

}
