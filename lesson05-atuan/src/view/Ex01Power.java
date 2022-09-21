package view;
import static java.lang.Math.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01Power {
	public static void main(String[] args) {
		System.out.println(isPower(5, 125));
		
	}
	private static boolean isPowerOf(int a, int b) {
		return b > a ? isPower(a,b) : isPower(b,a);
	}
	/**
	 * Test whether is b power of a
	 * @param a number
	 * @param b power number
	 * @return true if b is power of a
	 */
	private static boolean isPower(int a, int b) {
		double log = log(b) / log(a);
		
		log = BigDecimal.valueOf(log).setScale(1, RoundingMode.HALF_UP).doubleValue(); 
		
		System.out.println(log);
		return ceil(log) == floor(log);
	}

}
