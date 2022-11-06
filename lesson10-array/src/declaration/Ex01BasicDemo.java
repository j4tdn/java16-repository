package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 * MaÒng: KDL ðôìi týõòng + MaÒng nguyên thuÒy: int[], double[], float[] + MaÒng
		 * ðôìi týõòng: Integer[], String[], Item[]
		 * 
		 * MaÒng coì thêÒ ðc xem laÌ 1 ðôìi týõòng
		 */

		// Khai baìo vaÌ khõÒi taòo
		char[] letters = new char[5];
		// 5 ptu mang giaì triò mãòc ðiònh cuÒa char laÌ ''
		int[] digits = { 2, 5, 9, 10 };
		// we can use int[] digits = new int[] { 2, 5, 9, 10 };
		// digits => stack ; { 2, 5, 9, 10 } => heap
		int[] numbers = getNumbers();
		
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("digits: " + Arrays.toString(letters));
		System.out.println("digits: " + Arrays.toString(numbers));
	
		// Khai baìo vaÌ khõÒi taòo KÐT
		String[] sequences = new String[6]; // 6 ptu NULL
		Double[] salePrices =  {3.3, 5.2, 9.2, .7}; // .7 = 0.7
		System.out.println("digits: " + Arrays.toString(sequences));
		System.out.println("digits: " + Arrays.toString(salePrices));
	}

	private static int[] getNumbers() {
		return new int[] { 3, 5, 7, 15 };
	}
}
