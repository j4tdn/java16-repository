package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {
	private static final String PATTERN = "#,###.##";
	/*
	 * #: kí tự số - optional (có/không)
	 * 0: ký tự số - required 
	 * ,: ngăn cách phần nguyên
	 * .: ngăn cách phần thập phân
	 */
	public static void main(String[] args) {
		
		System.out.println("long --> " + 12345678987654321l);
		System.out.println("double --> " + 12345678987654321d);
		
		//vấn đề: khi 1 số thực đủ lớn thì JAVA tự động chuyển đổi sang E^ 
		// khi in ra --> người dùng khó hiểu
		Locale.setDefault(new Locale ("vi","VN"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		String formatted = df.format(12345678987654321.258d);
		System.out.println("Formatted --> " + formatted);
	}
}
