package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 * Mảng: KDL đối tượng
		 * + Mảng nguyên thủy: int[], double[], float[]
		 * + Mảng đối tượng: Interger[], String[], Item[]
		 *
		 */
		
		// Khai báo và khởi tạo
		char[] letters =new char[5]; // 5 phần tử mang giá trị mặc định 
		int[] digits = {2, 5, 8, 10};
		int[] numbers = getNumber();
		
		System.out.println("letters: " + Arrays.toString(letters));
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("numbers: " + Arrays.toString(numbers));
		
		// Khai báo và khởi tạo KDL 
		String[] sequences = new String[6]; // 6 phần tử NULL
		Double[] salesPrices = {3.3, 5.2, 9.2};
		
		System.out.println("sequences: " + Arrays.toString(sequences));
		System.out.println("double: " + Arrays.toString(salesPrices));

		
	}
	
	private static int[] getNumber() {
		return new int[] {2,5,8,10};
	}
}
