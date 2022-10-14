package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01DecimalFormat {
	private static final String PATTERN = "#,###.####";

	public static void main(String[] args) {
		System.out.println("long-->" + 1234567891222553l);

		System.out.println("double-->" + 1234567d);
		Locale.setDefault(new Locale("da", "DK"));
		/*
		 * #: ký tự số -optional (có /không) - phần nguyên 0: ký tự số - required ,:
		 * ngăn cách phần nguyên .: ngăn cách phần thập phân
		 */

		DecimalFormat df = new DecimalFormat(PATTERN);
		String formatted = df.format(1234567.258d);
		System.out.println("formatted:" + formatted);
	}

// Vấn đề : khi 1 số thực đủ lớn thì JAVA tự động chuyển đổi 
// sang E^x khi in ra --> người dùng khó hiểu 

}
