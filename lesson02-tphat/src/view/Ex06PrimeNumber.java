package view;

import java.lang.Math;

public class Ex06PrimeNumber {

	public static void main(String[] args) {
		int dem = 0, i = 0;
		while (dem < 200) {
			i++;
			if (isPrime(i) == true)
				dem++;
		}
		System.out.println("200th Prime number is: " + i);
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
