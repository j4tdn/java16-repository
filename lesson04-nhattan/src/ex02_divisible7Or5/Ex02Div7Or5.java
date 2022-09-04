package ex02_divisible7Or5;

import java.util.Arrays;

/**
 *	Cho một dãy số nguyên ngẫu nhiên gồm n chữ số, viết chương trình:
	Gom tất cả các số chia hết cho 7 về đầu dãy và tất cả các số chia hết cho 5 về cuối dãy. Các số
	vừa chia hết cho 5 vừa chia hết cho 7 và các số còn lại đưa ra giữa.
	Input: 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18
	Output: 21, 49, 14 , 12, 19, 32, 35, 33, 18, 25, 10
 */

public class Ex02Div7Or5 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(numbers(12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18)));
	}

	private static int[] numbers(int... numbers) {
		// bound = length - 1

		int boundForDiv7 = -1;
		int boundForDiv5 = numbers.length;
		int[] sorted = new int[numbers.length];
		int[] numbersLeft = new int[numbers.length];
		int boundForLeft = -1;

		for (int number : numbers) {
			if (divBy7Not5(number)) {
				boundForDiv7++;
				sorted[boundForDiv7] = number;
			} else if (divBy5Not7(number)) {
				boundForDiv5--;
				sorted[boundForDiv5] = number;
			} else {
				boundForLeft++;
				numbersLeft[boundForLeft] = number;
			}
		}

		for (int i = 1; i <= boundForLeft + 1; i++) {
			sorted[boundForDiv7 + i] = numbersLeft[i - 1];
		}
		return sorted;
	}

	private static boolean divBy7Not5(int number) {
		return (number % 7 == 0) && (number % 5 != 0);
	}

	private static boolean divBy5Not7(int number) {
		return (number % 5 == 0) && (number % 7 != 0);
	}
}
