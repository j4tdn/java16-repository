package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigNumber {
    public static void main(String[] args) {

        /*
         * int --> BigInteger
         * double --> BigDecimal
         * Hỗ trợ
         * 
         * 1. Lưu trữ số phạm vi lớn hơn
         * 2. Hỗ trọ rounding, scale ( số lượng chữ số ) nhiều hơn
         * 3. Hỗ trợ các hàm tính toán + - * /
         * 
         */
        
        BigDecimal value = BigDecimal.valueOf(123456789.258)
                .setScale(2, RoundingMode.HALF_UP);
        System.out.println("value: " + value);
        
        BigDecimal a = BigDecimal.valueOf(10);
        BigDecimal b = BigDecimal.valueOf(5);
        System.out.println("sum: " + a.add(b));
        System.out.println("sub: " + a.subtract(b));
        System.out.println("mul: " + a.multiply(b));
        System.out.println("div: " + a.divide(b));
        
    }
}
