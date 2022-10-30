package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/* Mảng: KDL đối tượng
		 * + mảng nguyên thuỷ: int[], double[], float[]
		 * + mảng đối tượng: Integer[], String[], Item[]
		 */
		
		//khai báo và khởi tạo
		char[] letters = new char[5]; //5 phần tử mang giá trị mặc định của char là ''	
		int numbers[] = getNumbers();
		int digits[] = {2, 5, 8, 10};
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("letters: " + Arrays.toString(letters));
		System.out.println("numbers: " + Arrays.toString(numbers));
		System.out.println("==============================");
		
		//khai báo và khởi tạo kiểu đối tượng
		String[] sequences = new String[6]; //6 phần tử null
		Double[] salesPrices= {3.3, 5.5, 6.2};
		System.out.println("sequences: " + Arrays.toString(sequences));
		System.out.println("salesPrices: " + Arrays.toString(salesPrices));
	}
	
	private static int[] getNumbers() {
		return new int[] {2, 5, 8, 4};
	}
}
