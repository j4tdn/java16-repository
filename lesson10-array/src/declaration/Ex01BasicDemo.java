package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 * Mảng: KDL đối tượng + Mạng nguyên thủy : int[], double[], float[] + Mạng đối
		 * tượng: Integer[], String[], Item[]
		 * 
		 * 
		 * 
		 */

		// Khai báo và khởi tạo
		char[] letters = new char[5];// 5 phần tử mang giá trị mặc định của char là ''

		int[] digits = { 2, 3, 4, 5, 3 };
		
		int[] numbers = getNumbers();

		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("letters: " + Arrays.toString(letters));
		System.out.println("numbers: " + Arrays.toString(numbers));
		
		// Khai báo và khởi tạo kiểu đối tượng
		String[] sequences = new String[6]; // 6 phần tử mang giá trị null
		
		Double[] salesPrices = {3.3, 5.3, 2.2, 4.2};
		System.out.println("sequences: " + Arrays.toString(sequences));
		System.out.println("salesPrices: " + Arrays.toString(salesPrices));
	}



	private static int[] getNumbers() {

		return new int[] {2,5,6,6};
	}
}
