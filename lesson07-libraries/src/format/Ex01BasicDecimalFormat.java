package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {
	 

	private static final String PATTERN = "#,###.00";
	/*
	 * #: ký tự số - optional (có / không)
	 * 0: ký tự số - required - phần thập phân
	 * ,: ngăn cách phần nguyên 
	 * .: ngăn cách phần thập phân
	 */
	public static void main(String[] args) {
		System.out.println("long>> "+ 123456789l);
		
		System.out.println("double>> "+ 1234567d);
		
		// vấn đề : khi 1 số thực đủ lớn (>8 số) thì java tự động chuyển đổi
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		
		String formatted = df.format(12345679999999.258d);
		System.out.println("formatted>>"+ formatted);
		
	}

}
