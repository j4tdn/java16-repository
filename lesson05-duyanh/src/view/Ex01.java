package view;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println(isPower(4, 64));
		System.out.println(isPower(64, 4));
		System.out.println(isPower(2, 4));
		System.out.println(isPower(2, 16));
		System.out.println(isPower(5, 125));
		System.out.println(isPowerOf2(5, 125)); 
		System.out.println(isPowerOf2(1d/8, 1d/2)); 
		
		

	}
	private static boolean isPower(double a, double b) {
		return b > a ? isPowerOf(a, b) : isPowerOf(b, a);
	}

	/**
	 * Test whether is b power of a
	 * 
	 * @param a number
	 * @param b power number
	 * @return true if b is power of a
	 */
	private static boolean isPowerOf(double a, double b) {
		double log = Math.log(b) / Math.log(a);
//		double log1 = Math.log(a) / Math.log(b);
//
//		if (Math.ceil(log) == Math.floor(log) || Math.ceil(log1) == Math.floor(log1)) {
//			return true;
//		}
//
//		return false;
		
		log = BigDecimal.valueOf(log).setScale(1, RoundingMode.HALF_UP).doubleValue();
		return Math.ceil(log) == Math.floor(log);
	}

	private static boolean isPowerOf2(double a, double b) {

		for (int i = 0; i < 99; i++) {
			if (Math.pow(a, i) == b) {
				
				return true;
			}
			if (Math.pow(b, i) == a) {
				return true;
			}
		}
		
		return false;

	}

}
