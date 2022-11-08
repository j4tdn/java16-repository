package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		/*
		 Mảng : KDL đối tượng
		  + Mảng nguyên thủy: int[], double[], float[]
		  + Mảng đối tượng  : Integer[], String[], Item[]
		 */

		// Khai báo và khởi tạo
		
		char[] letters = new char[5];
		int[] digits = {2, 5, 8, 10};
		int[] numbers = getNumbers();
		
		System.out.println(Arrays.toString(letters));
		System.out.println(Arrays.toString(digits));
		System.out.println(Arrays.toString(numbers));
		
		// Khai báo và khởi tạo KĐT
		String[] sequences = new String[6];
		Double[] salePrices = {3.3, 5.2, 9.2};
		System.out.println(Arrays.toString(sequences));
		System.out.println(Arrays.toString(salePrices));
		
	}
	
	private static int[] getNumbers() {
		return new int[] {1,2,3,4,5};
	}

}
