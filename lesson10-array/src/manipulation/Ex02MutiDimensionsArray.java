package manipulation;

import common.Tuple;

public class Ex02MutiDimensionsArray {
	public static void main(String[] args) {
		int[] a1D = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a1D.length; i++) {
			System.out.println(a1D[i] + "");
		}
		System.out.println();

		// rows x columns
		// each element --> each row
		// a2D 3*2
		int[][] a2D = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		for (int row = 0; row < a2D.length; row++) {
			for (int column = 0; column < a2D[column].length; column++) {
				System.out.println(a2D[row][column] + "");
			}
			System.out.println();
		}

		// array n dimensions --> n loops to get all elements
		// solving: array 1 dimension with element has n attribute
		Tuple[] t2D = { new Tuple(1, 2), new Tuple(3, 4), new Tuple(5, 6) };
		for (Tuple tuple : t2D) {
			System.out.println(tuple);
		}
	}

}
