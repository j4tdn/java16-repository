package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigNumber {
public static void main(String[] args) {
	/*
	 * int-->bigInteger
	 * double -->BigDecimal
	 * 
	 * hỗ trợ
	 * 1. lưu trữ số phạm vi lớn hơn*không in ra E^x)
	 * 2. hỗ trợ rounding/làm tròn nhiều hơn
	 * 3. hộ trợ các hạm tính toán như "+- * /"
	 * BigDecimal.valueOf :giá trị bất kỳ lưu vào BigDecimal
	 * commercial round: làm tròn chuẩn
	 */
	BigDecimal value = BigDecimal.valueOf(12343334423.258)
			.setScale(2, RoundingMode.HALF_UP);//setScale: làm tròn mấy chữ số
	System.out.println("value: " +value);//RoundingMode : làm tròn trên
	
	BigDecimal a =BigDecimal.valueOf(10);
	BigDecimal b = BigDecimal.valueOf(5);
	
	System.out.println("sum: " +a.add(b));
	System.out.println("sub: " +a.subtract(b));
	System.out.println("mul: " +a.multiply(b));
	System.out.println("sub: " +a.divide(b));
	
}
}
