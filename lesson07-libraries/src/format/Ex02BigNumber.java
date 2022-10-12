package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigNumber {
	public static void main(String[] args) {
		/*
		 * int --> big integer double --> BigDecimal Ho tro 1. Luu tru so pham vi lon
		 * (Khong in ra dang E^x) 2. Ho tro rounding nhieu hon 3. Ho tro cac ham tinh
		 * toan + - * / --> commercial round
		 */
		BigDecimal value = BigDecimal.valueOf(1234567898765432.258).setScale(2, RoundingMode.HALF_UP);
		System.out.println("Value: " + value);

		BigDecimal a = BigDecimal.valueOf(10);
		BigDecimal b = BigDecimal.valueOf(5);

		System.out.println("sum: " + a.add(b));
		System.out.println("sub: " + a.subtract(b));
		System.out.println("mul: " + a.multiply(b));
		System.out.println("div: " + a.divide(b));
	}
}
