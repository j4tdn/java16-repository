package Ex02ChangeNumber;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int[] numbers = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		int[] arr = new int[11];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 7 == 0 && numbers[i] % 5 != 0) {
				arr[count++] = numbers[i];
			}

		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 7 == 0 && numbers[i] % 5 == 0 || numbers[i] % 7 != 0 && numbers[i] % 5 != 0) {
				arr[count++] = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 5 == 0 && numbers[i] % 7 != 0) {
				arr[count++] = numbers[i];
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
