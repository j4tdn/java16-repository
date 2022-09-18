package view;

import static java.lang.Math.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01Power {
	/**
	 * Check whether b is the power of a
	 * 
	 * @param a number
	 * @param b power number
	 * @return true if b is the power of a
	 */
	private static boolean isPower(double a, double b) {
		double resultLog = log(b) / log(a);
		resultLog = BigDecimal.valueOf(resultLog).setScale(1, RoundingMode.HALF_UP).doubleValue();
		return ceil(resultLog) == floor(resultLog);
	}

	private static boolean isPowerOf(double a, double b) {
		return isPower(b, a) || isPower(a, b);
		
//		if (a * b < 1) {
//			return a > b ? isPower(a, b) : isPower(b, a);
//		}
//		return b > a ? isPower(a, b) : isPower(b, a);
	}

	public static void main(String[] args) {
		System.out.println(isPowerOf(1d / 2, 1d / 8));
	}
}
