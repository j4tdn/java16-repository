package fix;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("is Power " + isPowerOf(2, 8));
		System.out.println("is Power " + isPowerOf(8, 2));
		System.out.println("is Power " + isPowerOf(5, 125));
		System.out.println("is Power " + isPowerOf(1d/2, 1d/8));
	}

	private static boolean isPowerOf(double a, double b) {
		if(a*b <1) {
			return a > b ? isPower(a, b) : isPower(b, a);	
		}
		return b > a ? isPower(a, b) : isPower(b, a);
	}

	/**
	 * test whether b is power of a
	 * 
	 * @param a number
	 * @param b number
	 * @return true if b is power of a 5,125-->3.0000004=>BigDecimal
	 */
	private static boolean isPower(double a, double b) {
		double logresult = Math.log(b) / Math.log(a);
		// lấy cận trên bằng cận dưới
		logresult = BigDecimal.valueOf(logresult)
				.setScale(1, RoundingMode.HALF_UP)
				.doubleValue();
		
		// làm tròn kết quả về 3.0
		// ceil chỉ nhận về double --> phải convert lại
		System.out.println(logresult);

		return Math.ceil(logresult) == Math.floor(logresult);
	}

}
