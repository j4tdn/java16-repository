package homework;

import java.util.Arrays;
import java.util.Random;

public class Ex07Random {
	public static void main(String[] args) {
		Random rd = new Random();
		int numbers[] = new int [5];
		int noDupCount = 0;
		while (noDupCount < numbers.length) {
			int number = 20 + rd.nextInt(11);
			if (!isExists(numbers, number)) {
				numbers[noDupCount++] = number;
			}

		}
		System.out.println(Arrays.toString(numbers));
	}
	
	private static boolean isExists(int[] numbers, int testedNumber) {
		for (int number: numbers) {
			if(number == testedNumber) {
				return true;
			}
		}
		return false;
	}
}
