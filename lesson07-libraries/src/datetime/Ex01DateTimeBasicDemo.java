package datetime;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {

		// 1. Ngày, Tháng, Năm hiện tại
		// ICT: Indochina Time = UTC+7 -> Time zone
		Date now = new Date();
		System.out.println("now: " + now);

		// @Deprecated = outDate: bị loại bỏ, không nên dùng
		// Epoch = Unix Time = January 1, 1970, 00:00:00 GMT
		// date (7200): miliseconds since epoch time
		Date notNow = new Date(-72000000);
		System.out.println("notNow: " + notNow);

		// Date -> Sử dụng chủ yếu để lưu trữ
		// -> các phương thức xử lý -> Deprecated

		// singleton design pattern
		// idea: một class chỉ cho phép tạo ra duy nhất một đối tượng

		// time=1664197912767,ZoneInfo[id="Asia/Bangkok",firstDayOfWeek=1
		// minimalDaysInFirstWeek=1,YEAR=2022,MONTH=8,WEEK_OF_YEAR=40,WEEK_OF_MONTH=5
		// DAY_OF_MONTH=26,DAY_OF_YEAR=269,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4
		// AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=11,SECOND=52,MILLISECOND=767
		Calendar cNow = Calendar.getInstance();
		System.out.println("c: " + cNow);
		// c: field[Calendar.DAY_OF_MONTH]
		cNow.get(Calendar.DAY_OF_MONTH);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);
		int month = cNow.get(Calendar.MONTH) + 1;
		int year = cNow.get(Calendar.YEAR);
		String currentDate = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println("cNow date: " + currentDate);

		Calendar cNotNow = Calendar.getInstance();
// DateOfWeek: 1(Sunday), 2(Monday), 7(Sartuday)
// 17/08/1999 --> dayOfWeek, dayOfYear
// set() -> only set specify fields

		cNotNow.set(1999, Calendar.AUGUST, 17);

//cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
// Nếu không setTime( --> ComputeFields())
// --> toString in ra thông tin lỗi
		System.out.println("cNotNow: " + cNotNow);

		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("cNotNow dayOfWeek: " + dayOfWeek);
		System.out.println("cNotNow dayOfYear: " + dayOfYear);
		System.out.println("=============");
		// 2. Giờ 12-24, Phút, Giây
		String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) + ":" + cNotNow.get(Calendar.MINUTE) + ":"
				+ cNotNow.get(Calendar.SECOND);
		System.out.println("hms: " + hms);
		// 3. Thứ ngày, tuần trong tháng/ năm
		// 3.1 -> In ra thứ hiện tại
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + dow);
		String[] weekdays = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
		System.out.println("dayOfWeek: " + weekdays[dow - 1]);
		// TODO: enumeration
		System.out.println("=============");
		// 3.2 -> In ra tuần thứ mấy trong tháng/năm hiện tại
		int wom = cNow.get(Calendar.WEEK_OF_MONTH);
		int woy = cNow.get(Calendar.WEEK_OF_YEAR);
		System.out.println("WeekOfMonth: " + wom);
		System.out.println("WeekOfYear: " + woy);
		System.out.println("=============");

		// 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		int cmonth = cNow.get(Calendar.MONTH) + 1;
		cNow.set(Calendar.MONDAY, Calendar.OCTOBER);
		int daysInMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + cmonth + " has " + daysInMonth);
		int daysInYear = cNow.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(daysInYear);
		System.out.println("=============");
		// 5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2024));
		System.out.println("=============");
		// 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.println("VN FDOW: " + c1.getFirstDayOfWeek());
		System.out.println("=============");

		// 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy

		/*
		 * Tự làm Calendar c7 = Calendar.getInstance();
		 * 
		 * while (cNow.get(Calendar.DAY_OF_WEEK) > c7.getFirstDayOfWeek()) {
		 * c7.set(Calendar.DAY_OF_WEEK, -1); }
		 * System.out.println("First day of current week: " + c7.getTime());
		 */
		Locale.setDefault(Locale.FRANCE);
		System.out.println("default locale: " + Locale.getDefault());
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER, 19);
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);

		today.add(Calendar.DAY_OF_MONTH, tfdow - tdow);
		System.out.println("today: " + today);

		System.out.println("=============");

	}
}
