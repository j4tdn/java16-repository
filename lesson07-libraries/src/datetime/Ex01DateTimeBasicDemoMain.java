package datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Timer;

public class Ex01DateTimeBasicDemoMain {
	public static void main(String[] args) {

		// Ex01: Lấy thông tin thời gian với timezone
		// + 1. Ngày, Tháng, Năm hiện tại
		// now: Mon Sep 26 20:00:32 ICT 2022
		// ICT: Indochina time = UCT +7 --> Time zone
		Date now = new Date();
		System.out.println("now: " + now);

		// @Deprecated == OutDate ==> Should not use
		// Epoch = Unix Time = January 1, 1970, 00:00:00 GMT
		// day(7200): milliseconds since epoch time
		Date notNow = new Date(7200);
		System.out.println("notNow: " + notNow);

		// Date ==> sử dụng chủ yếu để lưu trữ
		// ==> phương thức xử lý --> Deprecated

		// singleton design patter
		// idea: một class chỉ cho phép tạo ra duy nhất 1 đối tượng
		// time=1664198168395,ZoneInfo[id="Asia/Bangkok",
		// firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=8,
		// WEEK_OF_YEAR=40,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=269,
		// DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,
		// MINUTE=16,SECOND=8,MILLISECOND=395,
		Calendar cNow = Calendar.getInstance();
		System.out.println("c --> " + cNow);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH) + 1; // c: fields[Calendar.DAY_OF_MONTH]
		int month = cNow.get(Calendar.MONTH);
		int year = cNow.get(Calendar.YEAR);
		String currentDay = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println("cNow date: " + currentDay);

		Calendar cNotNow = Calendar.getInstance();
		// DayOfWeek: 1(sunday), 2(monday)--> 7(saturday)
		// set specify fields
		cNotNow.set(1999, Calendar.AUGUST, 17);
		System.out.println("cNotNow: " + cNotNow);
		// cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
		// nếu không setTimeInMillis(--> computeFields())
		// --> toString sẽ in ra thông tin lỗi
		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("cNotNow dayOfWeek: " + dayOfWeek);
		System.out.println("cNotNow dayOfMonth: " + dayOfYear);

		System.out.println("================================================");

		// + 2. Giờ 12-24, Phút, Giây
		String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) + ":" + cNotNow.get(Calendar.MINUTE) + ":"
				+ cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: " + hms);
		// + 3. Thứ ngày, tuần/ngày trong tháng, năm
		// 3.1 --> In ra thứ hiện tại
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("cNow dow:" + dow);

		String[] weekdays = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
		System.out.println("dayOfWeek: " + weekdays[dow - 1]);
		// 3.2 --> In ra tuần thứ mấy trong tháng/ năm hiện tại
		System.out.println("weekOfMonth" + cNotNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOfYear" + cNotNow.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("================================================");
		
		// + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		cNotNow.set(Calendar.MONTH, Calendar.OCTOBER);
		int  cMonth	= cNow.get(Calendar.MONTH) + 1;
		// c.getActualMaximum(field) --> lấy giá trị lớn nhất của field thông qua dữ liệu c
		int daysInMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + cMonth + " has " + daysInMonth + "days");
		
		// + 5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLapYear: " + gc.isLeapYear(2000));
		
		// + 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		// US, Canada, Japan: FDOW --> 1
		// Others --> 2
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		// Locale (language, country)
		System.out.println("VN FDOW: " + c1.getFirstDayOfWeek());
		// + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		// + 8. In ra danh sách các ngày trong tuần 
		// ==> In ra danh sách các ngày trong tuần hiện tại
		// =>>> Epoch time

	}
}
