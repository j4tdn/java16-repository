package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 Mang : KDL doi tuong
		  +  Mang nguyen thuy : int[] , double[] , float[]
		  +  Mang Doi tuong: Integer[], String[], Item[]
		 */
		
		// Khai Bao va khoi tao
		
		char[] letters = new char[5]; // 5 phan tu mang gia tri mac dinh cua char la ''
		int[] digits = {2, 5, 8, 10};
		int[] numbers = getNumbers();
		
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("letters: " + Arrays.toString(letters));
		System.out.println("numbers " + Arrays.toString(numbers));
		
		// Khai bao va khoi tao KDT
		
		String[] sequences = new String [6]; // 6 phan tu NULL
		Double[] salesPrices = {3.3 , 5.2 , 9.2};
		
		System.out.println("sequences: " + Arrays.toString(sequences));
		System.out.println("salePrices: " + Arrays.toString(salesPrices));
	}
	
	private static int[] getNumbers() {
		int[] numbers = {2, 5, 8, 10};
		return numbers;
	}
}
