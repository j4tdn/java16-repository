package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {

	/**
	 * #: ký tự số - optional (có/không) - phần nguyên 0: ký tự số - required - phần
	 * thập phân ,: ngăn cách phần nguyên .: ngăn cách phần thập phân
	 */
	private static final String PATTERN = "#,###.00";

	public static void main(String[] args) {
		System.out.println("long-->" + 12345678987654321l);

		System.out.println("double-->" + 1234567d);

		// Vấn đề: Khi 1 số thực 'đủ lớn >=8 chữ số' thì JAVA tự động chuyển đổi sang
		// E^x khi in ra --> người dùng khó hiểu
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		String formated = df.format(12345678987654.258d);
		System.out.println("formated: " + formated);
	}
}
