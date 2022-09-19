package view;
import static java.lang.Math.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class Ex01Power {
	public static void main(String[] args) {
		System.out.println("Is power: " + isPowerOf(2, 4));
		System.out.println("Is power: " + isPowerOf(4, 2));
		System.out.println("Is power: " + isPowerOf(5, 125));
		System.out.println("Is power: " + isPowerOf(1d/2, 1d/8));
	}
	
	
	private static boolean isPowerOf(double a, double	 b) {
		if (a * b < 1)
			 return a > b ? isPower(a, b) : isPower(b, a);
		return b > a ? isPower(a, b) : isPower(b, a);
	}
	
	private static boolean isPower(double a, double b) {
		double resultLog = log(b) / log(a);
		resultLog = BigDecimal.valueOf(resultLog)
				.setScale(1, RoundingMode.HALF_UP).doubleValue();
		System.out.println("resultLog : "+resultLog);
		return ceil(resultLog) == floor(resultLog);
		
		
	}

}
