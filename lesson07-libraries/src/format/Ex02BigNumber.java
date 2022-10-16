package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigNumber {
	public static void main(String[] args) {
		/*
		 * int -> BigInteger double -> BigDecimal
		 * 
		 * Hỗ trợ 1. Lưu trữ số phạm vi lớn hơn 2. Hỗ trợ rounding, scale nhiều hơn 3.
		 * Hỗ trợ các hàm tính toán +,-,*,/ => commercial round
		 */
		BigDecimal value = BigDecimal.valueOf(123456789765432.258).setScale(2, RoundingMode.HALF_UP);
		System.out.println(value);

		BigDecimal a = BigDecimal.valueOf(10);
		BigDecimal b = BigDecimal.valueOf(5);
		System.out.println("sum: " + a.add(b));
		System.out.println(a); // a=10
		System.out.println("sub: " + a.subtract(b));
		System.out.println(a); // a=10
		System.out.println("mul: " + a.multiply(b));
		System.out.println(a); // a=10
		System.out.println("div: " + a.divide(b));
		System.out.println(a); // a=10
	}
}
