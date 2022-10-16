package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {
	/*
	 * # : ký tự số - optional - phần nguyên
	 * 0 : ký tự số - required - phần thập phân
	 * , : ngăn cách phần nguyên
	 * . : ngăn cách phần thạp phân
	 */
	private static final String PATTERN = "#,###.##";
	public static void main(String[] args) {
		System.out.println("long -> " + 12345678987654321l);
		System.out.println("double -> " + 123456789d);
		
		// Vấn đề :  khi 1 số thực quá lón (>8 chữ số)
		// => Java sẽ tự động chuyển sang E^x khi in ra
		// => người dùng khó hiểu
		Locale.setDefault(Locale.ENGLISH); // phải set Locale trước khi new DecimalFormat
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("Formatted: " +  df.format(23456789.3456d));
	}
}
