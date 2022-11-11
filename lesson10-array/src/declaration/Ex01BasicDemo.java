package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 * Mảng: kdl đối tượng
		 * + Mảng nguyên thủy: int[], double[], float[]
		 * +Mảng đối tượng: Integer[]'String[], Item[]
		 */
		
		
		//khai báo và khởi tạo
		char[] letters=new char[5];//5 phần tử mang giá trị mặc định của char là: ''
		int[]digits = {2, 5, 8, 10};
		//int[]numbers = {2, 5, 8, 10};
		int[] numbers = getNumbers();
		
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("letters: " + Arrays.toString(letters));
		System.out.println("numbers: " + Arrays.toString(numbers));
		
		//Khai báo và khởi tạo KDT
		String[] sequence= new String[6];
		double[] salesPrices = {3.3, 5.2, 9.2};
		
		System.out.println("sequence: " + Arrays.toString(sequence));
		System.out.println("salesPrices: " + Arrays.toString(salesPrices));
		
	}
	private static int[] getNumbers() {
		//int[]numbers = {2, 5, 8, 10};
		//return numbers;
		
		return new int[] {2, 5, 8, 10};
	}

}
