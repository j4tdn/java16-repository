package numberformat;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigNumber {
	public static void main(String[] args) {
		/**
		 * int --> BigInteger
		 * double --> BigDecimal
		 * 
		 * Hỗ trợ
		 * 1. Lưu trữ số phạm vi số lớn
		 * 2. Hỗ trợ rounding nhiều hơn
		 * 3. Hỗ trợ các hàm tính toán + - * /
		 */
		
		BigDecimal value = BigDecimal.valueOf(1234567865432.254)
									 .setScale(2, RoundingMode.HALF_UP);
		System.out.println("value:" + value);
	}
}
