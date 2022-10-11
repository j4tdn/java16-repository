package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {
	
	private static final String PATTENRN = "#,###.00";
	
	// #: kí tự số - optional(có/không) - phần nguyên
	// 0: ký tự số - required - phần thập phân
	// ,: ngăn cách phần nguyên
	// .: ngăn cách phần thập phân
	
	public static void main(String[] args) {
		System.out.println("long --> " + 12343123414123412l);
		
		System.out.println("double --> " + 1234567d);
		
		// Vấn đề: số > 8 chữ số thì java tự động chuyển sang E^x
		Locale.setDefault(new Locale("da" , "DK") );
		DecimalFormat df = new DecimalFormat(PATTENRN);
		String formatted = df.format(123456743241412341.234d);
		System.out.println("formatted: " + formatted);

	}

}
