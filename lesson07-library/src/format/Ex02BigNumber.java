package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigNumber {
	public static void main(String[] args) {
		/*
		 * int : bigInteger
		 * double: BigDecimal
		 * Hỗ trợ
		 * Phạm vi lớn hơn
		 * hỗ trợ rounding nhiều hơn
		 * hỗ trợ các hàm tính toán
		 */
		BigDecimal value = BigDecimal.valueOf(1234567898765432.258)
				.setScale(2, RoundingMode.HALF_UP);
		
		System.out.println(value);
		BigDecimal a = BigDecimal.valueOf(10);
		BigDecimal b = BigDecimal.valueOf(5);
		System.out.println(a.add(b));
		System.out.println(a.divide(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
	}

}
