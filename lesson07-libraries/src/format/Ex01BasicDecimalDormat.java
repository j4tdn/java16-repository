package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalDormat {
	private static final String PATTERN="#,###.###"; 
	/*
	 * #: ký tự số-optional(có/không) - nên phần nguyên
	 * 0: ký tự số-required - nên phần thập phân
	 * ,: ngăn cách phần nguyên
	 * .: ngăn cách phần thập phân
	 */
	public static void main(String[] args) {
		System.out.println("long: -->"+1234567898);
		System.out.println("double: -->"+1234567d);
		//Vấn đề: Khi 1 số thực đủ lớn >= 8 chữ số thì Java tự động chuyển 
		//sang E^x khi xin ra --> người dùng khó hiểu
		
		Locale.setDefault(new Locale("da","DK"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		String formatted = df.format(12345678987654.258d);
		System.out.println("formatted: "+formatted);
	}
}
