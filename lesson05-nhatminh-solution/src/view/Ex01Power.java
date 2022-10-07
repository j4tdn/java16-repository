package view;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.log;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01Power {
	public static void main(String[] args) {
		System.out.println("is power: " + isPowerOf(8, 2));
		System.out.println("is power: " + isPowerOf(2, 8));
		System.out.println("is power: " + isPowerOf(31, 32844521));
	}

	private static boolean isPowerOf(int a, int b) {
		return (b > a) ? isPower(a, b) : isPower(b, a);
	}

	/**
	 * Test whether is b power of a
	 * 
	 * @param a number
	 * 
	 * @param b number number
	 * 
	 * @return true if b is power of a
	 */
	private static boolean isPower(int a, int b) {
		double resultLog = log(b) / log(a);
		resultLog = BigDecimal.valueOf(resultLog).setScale(1, RoundingMode.HALF_UP).doubleValue();
		return ceil(resultLog) == floor(resultLog);
	}
}
