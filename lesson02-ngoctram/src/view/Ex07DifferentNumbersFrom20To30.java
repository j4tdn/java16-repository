package view;

import java.util.Random;

public class Ex07DifferentNumbersFrom20To30 {
	private static boolean isDifferentNumber(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (number == array[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int[] number = new int[] {-1, -1, -1, -1, -1};
		for (int i = 0; i < 5; i++) {
			int x;
			do {
				x = rd.nextInt(11);
			} while (!isDifferentNumber(number, x));
			number[i] = x;
			System.out.println("number[" + i + "]: " + (number[i] + 20));
		}
	}
}
