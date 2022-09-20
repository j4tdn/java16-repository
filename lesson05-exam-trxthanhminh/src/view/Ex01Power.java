package view;

import static java.lang.Math.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01Power {
	public static void main(String[] args) {
		int x = 2;
		int y = 8;
		System.out.println("is power: " + isPowerOf(8, 2));
		System.out.println("is power: " + isPowerOf(2, 8));
		System.out.println("is power: " + isPowerOf(4, 16));
		System.out.println("is power: " + isPowerOf(5, 125));

	}
	private static boolean isPowerOf(int a,int b) {
		return b > a ? isPower(a, b) : isPower(b, a);
	}
	
	
	/*
	 * Test whether is b power of a
	 * 
	 * @param a number
	 * @param b number
	 * @return true if b is power of a
	 */
	
	private static boolean isPower(int a, int b) {
		double resultLog = Math.log(b) / Math.log(a);

		resultLog = BigDecimal.valueOf(resultLog)
				.setScale(1, RoundingMode.HALF_UP)
				.doubleValue();
		
		System.out.println("result log: " + resultLog);
		return Math.ceil(resultLog) == Math.floor(resultLog);
	}
}
