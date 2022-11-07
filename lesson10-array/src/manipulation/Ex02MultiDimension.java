package manipulation;

import common.Tuple;

public class Ex02MultiDimension {
	public static void main(String[] args) {
		int [] a1D = {1,2,3,4};
		for (int i = 0; i< a1D.length; i++) {
			System.out.println(a1D[i] + " ");
			
		}
		
		System.out.println();
		
		//rows x columns
		//each element --> each row
		//a2D 3*2
		int[][] a2D = { {1,2}, {3,4},{5,6}};
		for (int row = 0; row<a2D.length;row++) {
			for(int col= 0; col< a2D[row].length;col++) {
				System.out.println(a2D[row][col] + " ");
				
			}
			System.out.println();
		}
		// array m dimensions --> n loops to get all elements
		// solving: array 1 dimension with Element has n attributes
		Tuple[] t2D = { new Tuple(1,2),
				        new Tuple(3,4),
				        new Tuple(5,6)};
		for (Tuple tuple: t2D) {
			System.out.println(tuple);
		}
	}

}
