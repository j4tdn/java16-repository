package format;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Ex01BasicDecimalFormat {
	private static final String PATTERN = "#,###.##";
	/*
	 * #: ký tự số - optional(có/không)
	 * 0: ký tự số - required
	 * ,: ngăn cách phần nguyên 
	 * .: ngăn cách phần thập phân
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("long --> " + 12345678987654321l);
		
		System.out.println("double --> " + 12345678987654321d);
		
		//Vấn đề: Khi 1 số thực đủ lớn >= 8 chữ số th9if Java tự động chuyển sang E^x khi xin ra --> người dùng khó hiểu
		Locale.setDefault(new Locale("da", "DA"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		String formatted = df.format(1234567.258d);
		System.out.println("Formatted: " + formatted);
		
	}

}
