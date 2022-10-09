package format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Ex01BasicDecimalFormat {

	/*
	 * #: kí tự số - optional 0: kí tự số - require ,: ngăn cách phần nguyên .: ngăn
	 * cách phần thập phân
	 */
	private static final String PATTERN = "#,###.00";

	public static void main(String[] args) {
		System.out.println("long --> " + 12345678987654321l);

		System.out.println("double --> " + 12345678987654321d);

		// Vấn đề: Khi 1 số thực 'đủ lớn' >= 8 chữ số --> Java tự động chuyển đổi sang
		// E^x khi in ra --> Người dùng khó hiểu
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		String formatted = df.format(12345678987654321.258d);
		System.out.println(formatted);

	}

}
