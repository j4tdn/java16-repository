package view;

import java.util.Iterator;
import java.util.Scanner;

public class Ex06Prime {

	public static void main(String[] args) {
		int n = 2;
		for (int dem = 0; dem < 200;) {
			n++;
			if (prime(n)) {
				dem++;
			}
		}
		System.out.println("The 200th prime number is " + n);
	}
	private static boolean prime(int n) {

		if (n < 2) {
			return false;
		}else {
				for (int i = 2; i < n; i++) {
					if(n % i == 0) {
						return false;
					}
				}
				return true;
			}
	}
}
