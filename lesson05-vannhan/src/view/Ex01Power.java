package view;

import static java.lang.Math.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01Power {
	public static void main(String[] args) {
		int x = 2;
		int y = 8;
//		System.out.println("is power: " + isPowerOf(2, 8));
//		System.out.println("is power: " + isPowerOf(8, 2));
//		System.out.println("is power: " + isPowerOf(5, 125));
		System.out.println("is power: " + isPowerOf(1d/2, 1d/4));
	}

	private static boolean isPowerOf(double a,double b) {
		if(a*b<1) {
			return a > b ? isPower(a, b) : isPower(b, a);
		}
		return b > a ? isPower(a, b) : isPower(b, a);
	}

	/**
	 * Test whether is b power of a
	 * 
	 * @param a number
	 * @param b power number
	 * @return true if b is power of a
	 */
	private static boolean isPower(double a, double b) {
		double resultlog = log(b) / log(a);
		
		resultlog = BigDecimal.valueOf(resultlog).setScale(1, RoundingMode.HALF_UP).doubleValue();
		System.out.println(resultlog);
		
		return ceil(resultlog) == floor(resultlog);
	}
}
