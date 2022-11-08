package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {

	/*
	 * Mang? : KDL doi tuong + Mang nguyen thuy : int[] double[] float[] + Mang doi
	 * tuong : Object[] Biginteger[] String[] Integer[]
	 */

	// khaibao va khoi tao
	public static void main(String[] args) {
		char[] letters = new char[5]; // phan tu mac dinh ' '
		int[] digits = { 2, 5, 8, 10 };
		int[] numbers = getNumbers();
		System.out.println("digit " + Arrays.toString(digits));
		System.out.println("letters " + Arrays.toString(letters));
		System.out.println("numbers " + Arrays.toString(numbers));
		
		//Khai bao va khoi tao kieu doi tuong
		String[] sequences = new String[6];
		Double[] salePrices = {3.3, 5.2, 9.2};
		System.out.println("sequences " + Arrays.toString(sequences));
		System.out.println("salePrices " + Arrays.toString(salePrices));
	}
	
	private static int[] getNumbers() {
		return new int[] { 2,5,8,10};
	}
	

}
