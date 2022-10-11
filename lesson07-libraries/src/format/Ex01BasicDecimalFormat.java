package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {
	
	private static final String PATTERN = "#,###.00";
	/**
	 * # : ký tự số - optional(có/không) - phần nguyên
	 * 0 : ký tự số - required - phần thập phân
	 * , : ngăn cách cái phần nguyên
	 * . : ngăn cách phần thập phân
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("long --> " + 12345678987654321l);
		System.out.println("double --> " + 12345678d);

		// vấn đề: khi 1 số thực 'đủ lớn >= 8 chữ số' thì JAVA tự động chuyển đổi sang
		// E^x khi in ra --> người dùng khó hiểu
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		String formatted = df.format(12345678987654321.258d);
		System.out.println("fomarted: " + formatted);
	}

}
