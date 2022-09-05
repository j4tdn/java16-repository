package powernumber;

import java.util.Scanner;

public class PowerNumber {
	public static void main(String[] args) {
		int a = 2;
		int b = 8 ;
		isPowerOf(a, b);
		if (isPowerOf(a, b) == true ) {
		System.out.println("a hoac b la luy thua cua nhau");
		} else System.out.println("Hai so khong phai la luy thua cua nhau");
	}

	private static boolean isPowerOf(int a, int b) {
		for (int i = 1; i <= 100; i++) {
			if (Math.pow(a, i) == b || Math.pow(b, i) == a) {
				return true;
			}
		}
		return false;
	}

}
