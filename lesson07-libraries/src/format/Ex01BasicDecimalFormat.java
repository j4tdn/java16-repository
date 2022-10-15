package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {

	/*
	 * #: Ký tự số - optional(có/không) - phần nguyên 0: Ký tự số - required - phần
	 * thập phân ,: Ngăn cách phần nguyên .: Ngăn cách phần thập phân
	 */
	private static final String PATTERN = "#,###.00";

	public static void main(String[] args) {
		System.out.println("long-->" + 12345678987654321l);

		System.out.println("double-->" + 1234567d);
//vấn đề: khi 1 số thực 'đủ lớn >= 8 chữ số' thì java tự động chuyển đổi sang E^x khi in ra --> người dùng khó hiểu
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		
		String formatted = df.format(123456789987654321.258d);
		System.out.println("formatted:" + formatted);
	}

}
