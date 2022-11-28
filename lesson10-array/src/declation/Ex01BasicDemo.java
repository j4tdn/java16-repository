package declation;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 * Mảng: Kiểu dữ liệu đối tượng + Mảng nguyên thủy: int [],double[],float [] +
		 * Mảng đối tượng : Integer[], String[], Item[]
		 * 
		 */

		// Khai báo và khởi tạo
		char[] letters = new char[5]; // 5 phần tử mang giá trị mặc định là ' '
		int[] degits = { 2, 5, 8, 10 };
		int[] numbers = getNumber();

		System.out.println("letters" + Arrays.toString(letters));
		System.out.println("degits" + Arrays.toString(degits));
		System.out.println("numbers" + Arrays.toString(numbers));

		// Khai báo và khơir tạo kiểu đối tượng
		String[] sequences = new String[6]; // 6 phần tử kiểu NULL
		Double[] salesPrices = { 3.3, 5.2, 9.2 };

		System.out.println("sequences" + Arrays.toString(sequences));
		System.out.println("salesPrices" + Arrays.toString(salesPrices));
	}

	private static int[] getNumber() {
		return new int[] { 2, 5, 8, 10 };
	}
}
