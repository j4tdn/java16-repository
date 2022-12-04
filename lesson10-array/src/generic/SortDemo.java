package generic;

import java.lang.reflect.Array;
import java.util.Arrays;

import common.Tuple;

public class SortDemo {
	public static void main(String[] args) {
		String[] sequences = {"A" , "B"};
		
		//X[] --> X implements Comparable<X>
		Arrays.sort(sequences);
		System.out.println(Arrays.toString(sequences));
		
		Tuple[] tuples = { new Tuple (1,10) , new Tuple (2,20)};
		
		System.out.println("tuples --> " + Arrays.toString(tuples));
	}
	
	private static <E extends Comparable<E>>void sort(E[] elementData) {
		Arrays.sort(elementData);
	}
}
