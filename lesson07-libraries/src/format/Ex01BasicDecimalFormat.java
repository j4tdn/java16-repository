package format;

import java.text.DecimalFormat;

import java.util.Locale;

//định dạng các số rất lớn từ dạng E^x sang số nguyên

public class Ex01BasicDecimalFormat {
	private static final String PATTERN = "#,###.00";
	//#,###.0000--> 1.234.567,2580
	//#,###.####--> 1.234.567,258
	//#,###.###-->  1.234.567,258
	//#,###.00-->   1.234.567,26
	
	/*
	 * #: ký tự số- optional(có hoặc không) - phần nguyên
	 * 0: ký tự số - required - phần thập phân
	 * ",": ngăn cách phần nguyên
	 * ".": ngăn cách phần thập phân
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("long --> " + 1922222454342l);
		
		System.out.println("double -->" + 22233333222330d);
		//số thực: double -->2.223333322233E13
		
		//vấn đề: khi 1 số thực đủ lớn >=8 chữ số thì java
		// tự động chuyển sang E^x khi in ra--> người dùng khó hiểu
		
		Locale.setDefault(new Locale("da","DK"));
		//in ra format ở quốc gia nào thì dùng locale ở đó
		DecimalFormat df = new DecimalFormat(PATTERN);

		String Fromatted = 	df.format(1234567.258d);
		System.out.println("formatted: " + Fromatted);
	}

}
