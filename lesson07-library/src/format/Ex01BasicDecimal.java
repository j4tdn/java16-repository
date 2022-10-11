package format;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Ex01BasicDecimal {
	private static final String PATTERN ="##,###.##";
			/*
			 * # ký tự số - optional(có/không) - phần nguyên
			 * 0 ký tự số - require - phần thập phân
			 * ,: ngăn cách phần nguyên
			 * .: ngăn cách phần thập phân
			 */
	public static void main(String[] args) {
		System.out.println("long -->" + 12345678987654321l);
		
		System.out.println("double-->" + 123456789d);
		//khi 1 số thực đủ lớn thì Java tự động chuyển đổi sang e mũ X khi in ra--> người dùng khó hiểu
	    Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		String formatted = df.format(1234567.258d);
		System.out.println(formatted);
	}

}
