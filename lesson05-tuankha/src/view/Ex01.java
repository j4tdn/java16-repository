package view;
import static java.lang.Math.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01 {

	public static void main(String[] args) {
		System.out.println(isPowerOf(8,2));
		System.out.println(isPowerOf(2,8));
		System.out.println(isPowerOf(6,2));
		System.out.println(isPowerOf(20,4));
		System.out.println(isPowerOf(64,2));
		System.out.println(isPowerOf(-2,4));
		System.out.println(isPowerOf(5,125));
	}
	
	private static boolean PowerOf(int a, int b) {
		if(a * b < 1) {
			return a > b ? isPowerOf(a, b) : isPowerOf(b, a);
		}
		return b > a ? isPowerOf(a, b) : isPowerOf(b, a);
	}
	
	/**
	 * Test whether is b power of a.
	 * @param a number
	 * @param b power number
	 * @return True if b is power of a 
	 */
	private static boolean isPowerOf(int a, int b) {
		double n1 = BigDecimal.valueOf(log(b)/log(a)).setScale(1, RoundingMode.HALF_UP).doubleValue();
		return ceil(n1) == floor(n1);
	}

}
