package homework;

import java.util.Random;
import java.util.Scanner;

public class Ex02Factorial {
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Số các số cần tính là: ");
		int dem = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= dem; i++) {
			int rdn = rd.nextInt(5);
			System.out.println("Number random: " + rdn);
			int ft = 1;
			for (int x = 1; x <= rdn; x++) {
				ft = ft * x;
			}
			sum = sum + ft;
		}
		System.out.println("Tổng là: " + sum);
	}
	/*
	 * cách 2
	 *
	 * public class abjjs { public static void main(String[] args) {
	 * System.out.println(sumOfFactorial(5,5)); } private static int
	 * sumOfFactorial(int... numbers) { int sum =0; for (int number: numbers) { sum
	 * += factorial(number); } return sum; } private static int factorial(int n) {
	 * int result = n; while (n>1) { result *= --n; } return result; }
	 * 
	 * }
	 * 
	 */

}
