package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) throws InterruptedException {
//		Lấy thông tin thời gian với timezone
//		+ 1. Ngày, Tháng, Năm
		// now: Mon Sep 26 19:54:38 ICT 2022
		// ICT: Indochina time = UTC+7 ==>TimeZone
		// Không tham số đầu vào thì sẽ là now
		Date now = new Date();
		System.out.println("now: " + now);

		// @Deprecated == OutDate ==> Should not use
		// Date notNow = new Date(2020,10,10);

		// Epoch = Unix Time = January 1, 1970, 07:00:00 GMT
		Date notNow = new Date(1664197909319l);// Thêm l -> long
		System.out.println("notNow: " + notNow);

		// ==> Date ==> sử dụng chủ yếu để lưu trữ
		// ==> phương thức xử lý của Date --> Deprecated
		// ==> Chuyển qua Calendar
		Calendar cNow = Calendar.getInstance();
		System.out.println("c --> " + cNow);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);// c: fields[Calendar.DAY_OF_MONTH]
		int month = cNow.get(Calendar.MONTH) + 1;// Chú ý +1
		int year = cNow.get(Calendar.YEAR);
		String currentDate = dayOfMonth + "/" + month + "/" + year;
		System.out.println("Current date: " + currentDate);

		Calendar cNotNow = Calendar.getInstance();
		// 17/8/1999
		// DayOfWeek: 1(Sunday), 2(Monday) --> 7(Saturday)
		cNotNow.set(1999, Calendar.AUGUST, 17);
//		cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());// Dùng để sửa toString() đang bị lỗi
		System.out.println("cNotNow --> " + cNotNow.toString());
		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
//		System.out.println("cNotNow --> " + cNotNow.toString());//Hoặc toString sau khi get thì sẽ được compute lại
		System.out.println("cNotNow dayOfWeek: " + dayOfWeek);
		System.out.println("cNotNow dayOfYear: " + dayOfYear);

		System.out.println("=======================");
//		+ 2. Giờ 12-24, Phút, Giây
		int b = 1;
		while (b-- != 0) {
			cNotNow = Calendar.getInstance();
			String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) + ":" + cNotNow.get(Calendar.MINUTE) + ":"
					+ cNotNow.get(Calendar.SECOND);
			System.out.println("HMS: " + hms);
			TimeUnit.SECONDS.sleep(1);
		}
		System.out.println("=======================");
//		+ 3. Thứ ngày, tuần/ngày trong tháng, năm
		// 3.1 --> In ra thứ hiện tại --> Text
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		String temp = cNow.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ROOT);
		System.out.println("day of week: " + temp);
		// 3.2 --> In ra tuần thứ mấy trong tháng/năm hiện tại
		System.out.println("=======================");
//	    + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		int cMonth = cNow.get(Calendar.MONTH);
		// cNow.getActualMaximum(field) --> Lấy giá trị lớn nhất của field thông qua dữ
		// liệu trong cNow
		// VD: Tháng 2 có 28 ngày thì getActualMaximum thì là 28 còn getMaximum thì là
		// 31
		int daysInMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month: " + (cMonth + 1) + " has " + daysInMonth + " days");
		System.out.println("=======================");
//		+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2020));
		System.out.println("=======================");
//		+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		Calendar c1 = Calendar.getInstance(Locale.ROOT);
		System.out.println("FDOW: " + c1.getFirstDayOfWeek());
		System.out.println("=======================");
//	    + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		System.out.println("default locale: " + Locale.getDefault());
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER, 1);
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);

		today.add(today.DAY_OF_MONTH, tfdow - tdow);
		System.out.println("today: " + today);
		System.out.println("=======================");
//		+ 8. In ra danh sách các ngày trong tuần hiện tại
		System.out.println("========Current Week Days========");
		for (int i = 0; i < 7; i++) {
			System.out.println(today);
			today.add(today.DAY_OF_MONTH, 1);
		}
//		=>>> Epoch time

	}
}
