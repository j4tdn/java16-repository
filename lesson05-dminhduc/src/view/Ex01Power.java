package view;

import static java.lang.Math.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class Ex01Power {

	public static void main(String[] args) {
		int x = 2;
		int i =8;
		System.out.println("is power: " + isPowerOf(1d/2, 1d/4));

		System.out.println("is power: " + isPowerOf(2, 4));
		
	}
	private static boolean isPowerOf(double a, double b)
	{
		if(a * b < 1)
		{
			return a > b ? isPower(a, b) : isPower(b, a);
		}
		
		return b > a ? isPower(a, b) : isPower(b, a);
	}
	/**
	 * Test whether is b power of a.
	 * @param a number
	 * @param b power number
	 * @return true if b is power of a
	 */
	private static boolean isPower(double a, double b)
	{
		double resultLog = log(b) / log(a);
		resultLog = BigDecimal.valueOf(resultLog).setScale(1, RoundingMode.HALF_UP).doubleValue();//làm tròn 1 chữ số 

		System.out.println("resultLog:  " + resultLog);
		return ceil(resultLog) == floor(resultLog);//làm tròn trên và làm tròn dưới
	}
}
