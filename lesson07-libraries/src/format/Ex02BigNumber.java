package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigNumber {
	public static void main(String[] args) {
		/*
		 * int>> BigInteger
		 * double>> BigDecimal
		 * 
		 * hỗ trợ
		 * 1. lưu trữ số phạm vi lớn hơn
		 * 2. hỗ trợ rounding, scale nhiều hơn
		 * 3. hỗ trợ các hàm tính toán 
		 */
		BigDecimal value = BigDecimal.valueOf(1234567898765432.258)
				.setScale(2,RoundingMode.HALF_UP);
		System.out.println("value>>"+ value);
		
		BigDecimal a = BigDecimal.valueOf(10); 
		BigDecimal b = BigDecimal.valueOf(5); 
		
		System.out.println("sum: " + a.add(b));
		System.out.println("sub: " + a.subtract(b));
		System.out.println("mul: " + a.multiply(b));
		System.out.println("div: " + a.divide(b));

		 
		
	}

}
