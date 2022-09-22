package view;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * Khi 1 hàm bị ngoại lệ
 * C1: Bắt (try/catch) lỗi tại hàm đó
 * C2: Ném (throw/throws) ngoại lệ ra để bắt, xử lý lỗi đó
 */
public class Ex02DivideThrows {
	public static void main(String[] args) {
		System.out.println("result: " + BigDecimal.valueOf(divide(4,0)).setScale(1, RoundingMode.HALF_UP).doubleValue());
	}

//	Ném tại vị trí khai báo hàm
//	Nếu chỗ gọi ko xử lý lỗi thì vẫn bị crash app
//	throws runtime exception (checked) -> chỗ gọi ko bắt buộc xử lý
//	throws compile exception (unchecked) => chỗ gọi bắt buộc phải xử lý
	public static double divide(double a, double b) throws ArithmeticException{
		return a / b;
	}
}
