package ex01;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.log;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exponential {
	public static void main(String[] args) {
		int x = 2;
		int y = 8;
		System.out.println("is power :" + isPower(8, 2));
		System.out.println("is power :" + isPower(5, 125));
	}

	private static boolean isPower(int a, int b) {
		double log = log(b) / log(a);
		log = BigDecimal.valueOf(log).setScale(1, RoundingMode.HALF_UP).doubleValue();

		return ceil(log) == floor(log);

	}

	private static boolean isPowerof(int a, int b) {
		return b > a ? isPower(a, b) : isPower(b, a);
	}
}
