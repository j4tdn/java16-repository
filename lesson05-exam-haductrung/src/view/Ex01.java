package view;
import static java.lang.Math.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01 {
	public static void main(String[] args) {
		int x=5;
		int y=125;
		System.out.println("is power: " +isPower(x, y));
	}
	private static boolean isPowerOf(int a, int b) {
		return a>b ? isPower(a, b): isPower(b, a);
	}
	/**
	 * Test whether is b power of a
	 * @param a number
	 * @param b power number
	 * @return true is b is power os a
	 */
	private static boolean isPower(int a, int b) {
		double resultLog=Math.log(b)/Math.log(a);
		resultLog =BigDecimal.valueOf(resultLog)
				.setScale(1, RoundingMode.HALF_UP).doubleValue();
		
		System.out.println("result log: " +resultLog);
		return Math.ceil(resultLog)==Math.floor(resultLog);
	}

}
