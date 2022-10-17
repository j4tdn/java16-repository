package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigNumber {
	public static void main(String[] args) {
		/*
		 * 
		// int --> BigInteger
		// double --> BigDecimal
		 * 
		 * hỗ trợ:
		 * 	1. Lưu trữ số phạm vi lớn
		 * 	2. Hỗ trợ rounding (làm tròn) nhiều hơn
		 * 	3. hỗ trợ các hàm + - * /
		 *  --> commercial round
		 */
		BigDecimal value = BigDecimal.valueOf(1234567898765432.258)
				.setScale(2, RoundingMode.HALF_UP);
		System.out.println("BigDecimal --> " + value);
		
		BigDecimal a = BigDecimal.valueOf(5);
		BigDecimal b = BigDecimal.valueOf(10);
		
		System.out.println("sum: " + a.add(b));
		System.out.println("sub: " + a.subtract(b));
		System.out.println("mul: " + a.multiply(b));
		System.out.println("div: " + a.divide(b));
	}
}
