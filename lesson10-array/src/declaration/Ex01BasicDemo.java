package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		char[] letters = new char[5];
		int[] digits = {2,5,8,10,17};
		int[] numbers = getNumbers();
		System.out.println("letters: " + Arrays.toString(letters));
		System.out.println("digits: " + Arrays.toString(digits));
		System.out.println("numbers: " + Arrays.toString(numbers));
		String[] sequence = new String[6];
		Double[] price = {3.3,5.2};
	}
	private static int[] getNumbers() {
		return new int[] {2,5,8};
	}

}
