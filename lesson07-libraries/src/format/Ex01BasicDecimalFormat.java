package format;

import java.text.DecimalFormat;
import java.util.Locale;

public class Ex01BasicDecimalFormat {
	private static final String PATTERN = "#,###.##";
	/*
	 * #: ky tu so - optional
	 * 0: ky tu so - required
	 * ,: ngan cach phan nguyen
	 * .: ngang cach phan thap phan
	 */
	public static void main(String[] args) {
		System.out.println("long --> " + 12345678987654321l);
		
		System.out.println("double --> " + 1234567d);
		
		
		
		//Van de: khi 1 so thuc "du lon" thi java tu dong chuyen doi
		// sang E^x khi in ra --> nguoi dung kho hieu
		Locale.setDefault(new Locale("da","DK"));
		DecimalFormat df = new DecimalFormat(PATTERN);
		String formatted = df.format(12345678987654.258d);
		System.out.println("formatted: " +formatted); 
	}

 }
