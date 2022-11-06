package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 * Ma�ng: KDL ���i t���ng + Ma�ng nguy�n thu�y: int[], double[], float[] + Ma�ng
		 * ���i t���ng: Integer[], String[], Item[]
		 * 
		 * Ma�ng co� th�� �c xem la� 1 ���i t���ng
		 */

		// Khai ba�o va� kh��i ta�o
		char[] letters = new char[5];
		// 5 ptu mang gia� tri� m��c �i�nh cu�a char la� ''
		int[] digits = { 2, 5, 9, 10 };
		// we can use int[] digits = new int[] { 2, 5, 9, 10 };
		// digits => stack ; { 2, 5, 9, 10 } => heap
		int[] numbers = getNumbers();
		
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("digits: " + Arrays.toString(letters));
		System.out.println("digits: " + Arrays.toString(numbers));
	
		// Khai ba�o va� kh��i ta�o K�T
		String[] sequences = new String[6]; // 6 ptu NULL
		Double[] salePrices =  {3.3, 5.2, 9.2, .7}; // .7 = 0.7
		System.out.println("digits: " + Arrays.toString(sequences));
		System.out.println("digits: " + Arrays.toString(salePrices));
	}

	private static int[] getNumbers() {
		return new int[] { 3, 5, 7, 15 };
	}
}
