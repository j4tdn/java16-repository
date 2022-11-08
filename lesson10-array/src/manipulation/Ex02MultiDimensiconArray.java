package manipulation;

import java.util.Arrays;

import common.Tuple;

public class Ex02MultiDimensiconArray {
	public static void main(String[] args) {
		int[] a1D = { 1, 2, 3, 4, 5 };
		Arrays.stream(a1D).boxed().forEach(o -> System.out.print(o + " "));
		System.out.println();
		int[][] a2D = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int i = 0; i < a2D.length; i++) {
			for (int j = 0; j < a2D[i].length; j++) {
				System.out.print(a2D[i][j] + " ");
			}
			System.out.println();
		}
		Tuple[] tuple = { new Tuple(1, 2),
				          new Tuple(3, 4),
				          new Tuple(5, 6),
				        };
		for (Tuple tuples : tuple) {
			System.out.println(tuples);
		}
		// Arrays.asList(tuple).stream().forEach(o -> System.out.println(o));
		// array n dimension --> n loop to get all elements
		// solving : array 1 dimension with element has n attributes

	}

}
