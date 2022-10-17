package view;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int n1 = 75;
		int n2 = 15;
		int[] s1 = numberDivisorPrime(n1);
		int[] s2 = numberDivisorPrime(n2);
		System.out.println("uoc so nguyen to s1 : " + n1 + " = "+ Arrays.toString(s1));
		System.out.println("uoc so nguyen to s2 : " + n2 + " = "+ Arrays.toString(s2));
		checkDivisorPrime(s1, s2);
	}

	public static boolean checkPrime(int n) {
		if (n > 1) {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
			return true;
		} else
			return false;
	}

	public static int[] numberDivisorPrime(int n) {
		int[] s = new int[0];
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && (checkPrime(i))) {			
				s = addArrays(s, i);
			}
		}
		return s;
	}

	public static int[] addArrays(int[] numbers, int value) {
		int[] tmp = new int[numbers.length + 1];
		for (int i = 0; i < numbers.length; i++) {
			tmp[i] = numbers[i];

		}
		tmp[tmp.length - 1] = value;
		return tmp;
	}

	private static boolean checkDivisorPrime(int[] s1, int[] s2) {
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {

				if (s1[i] == s2[j]) {

					System.out.println("YES");
					return true;
				} else {
					System.out.println("NO");
					return false;
				}
			}
		}
		return false;

	}

}
