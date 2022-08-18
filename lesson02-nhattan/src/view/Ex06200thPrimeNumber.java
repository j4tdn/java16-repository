package view;

/**
 * Bài 6: Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
 */

public class Ex06200thPrimeNumber {
	public static void main(String[] args) {
		System.out.println(find200thPrime());
	}
	
	private static int find200thPrime() {
		int count = 1;
		for (int i = 3; i < Integer.MAX_VALUE; i+=2) {
			if (isPrime(i)) {
				count++;
			}
			if (count == 200) {
				return i;
			}
		}
		return -1;
	}

	private static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}

		double sqrtOfNum = Math.sqrt(number);

		for (int i = 2; i <= sqrtOfNum; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
}
