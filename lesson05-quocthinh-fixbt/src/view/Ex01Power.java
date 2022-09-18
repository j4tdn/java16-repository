package view;

import static java.lang.Math.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01Power {
	public static void main(String[] args) {
//		System.out.println("is power: " + isPowerOf(8, 2));
//		System.out.println("is power: " + isPowerOf(2, 8));
//		System.out.println("is power: " + isPowerOf(4, 16));
//		System.out.println("is power: " + isPowerOf(5, 125));
		
		System.out.println("is power decimal: " + isPowerOf(1d/2, 1d/8));
		
	}

	private static boolean isPowerOf(double a, double b) {
		if(a*b < 1) {
			return b < a ? isPower(a, b) : isPower(b, a);
		}
		return b > a ? isPower(a, b) : isPower(b, a);
	}

	/**
	 * Test whether is b power of a.
	 * 
	 * @param a number
	 * @param b power number
	 * @return true if b is power of a
	 */
	private static boolean isPower(double a, double b) {
		double resultLog = log(b) / log(a);

		resultLog = BigDecimal.valueOf(resultLog).setScale(1, RoundingMode.HALF_UP).doubleValue();

		return ceil(resultLog) == floor(resultLog);
	}

}
