package view;

import static java.lang.Math.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex02Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = sc.nextInt();
		System.out.println("Nhap b: ");
		int b = sc.nextInt();
		System.out.println("is power " + isPowerOf(a, b));
	}

	private static boolean isPowerOf(int a, int b) {
		if (a * b < 1) {
			return a > b ? isPower(a, b) : isPower(b, a);
		}
		return b > a ? isPower(a, b) : isPower(b, a);
	}

	private static boolean isPower(int a, int b) {
		double resultLog = log(b) / log(a);
		resultLog = BigDecimal.valueOf(resultLog).setScale(1, RoundingMode.HALF_UP).doubleValue();
		return ceil(resultLog) == floor(resultLog);
	}

}
