package homework;

import java.util.Scanner;

public class Ex06PrimeNumber {
	
	public static void main(String[] args) {

		
	}
	//ham kiem tra so nguyen to
	public static boolean isPrimeNumber(int number) {
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}