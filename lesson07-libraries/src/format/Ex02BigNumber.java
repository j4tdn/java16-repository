package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigNumber {
	public static void main(String[] args) {
		// int -> BigInteger double -> BigDecimal
		// Hỗ trợ
		// 1. Lưu trữ số phạm vi lớn hơn
		// 2. Hỗ trợ rounding, scale nhiều hơn 3.
		// Hỗ trợ các hàm tính toán + - * /
		// -->commercial round
		BigDecimal value = BigDecimal.valueOf(1234567898765432.59).setScale(2, RoundingMode.HALF_UP);// Phải xem xét lại
		System.out.println("value: " + value);

		BigDecimal a = BigDecimal.valueOf(5);
		BigDecimal b = BigDecimal.valueOf(10);

		System.out.println("sum: " + a.add(b));
		System.out.println("sum: " + a.subtract(b));
		System.out.println("sum: " + a.multiply(b));
		System.out.println("sum: " + a.divide(b));
	}
}
