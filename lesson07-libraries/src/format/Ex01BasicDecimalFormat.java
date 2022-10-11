package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {
	// #: Ký tự số - optional
	// 0: Ký tự số - required
	// ,: Ngăn cách phần nguyên
	// .: Ngăn cách phần thập phân
	private static final String PATTERN = "#,###.00";

	public static void main(String[] args) {
		System.out.println("long -->" + 12345678987654321l);
		System.out.println("double -->" + 1234567d);
		// Vấn đề: khi 1 số thực >= 8 chữ số thì JAVA tự động chuyển đổi sang dạng E^x
		// khi in ra -> người dùng khó hiểu

		Locale.setDefault(new Locale("da", "DK"));// Để đổi "," và "."
		DecimalFormat df = new DecimalFormat(PATTERN);
		String formatted = df.format(123456789876543.258d);
		System.out.println("formatted: " + formatted);
	}
}
