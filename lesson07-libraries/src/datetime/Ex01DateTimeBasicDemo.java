package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {

	public static void main(String[] args) {
		// Lấy thông tin thời gian với timezone
		// + 1. Ngày, Tháng, Năm hiện tại
		// Mon Sep 26 19:53:16 ICT 2022
		// ICT: Indochina time = UTC+7 ==> TimeZone
		Date now = new Date();
		System.out.println("now: " + now);

		// @Deprecated == OutDate ==> Should not use
		// Epoch = Unix Time = January 1, 1970, 00:00:00 GMT
		// date(7200): milliseconds since epoch time
		Date notNow = new Date(1664197918696l);
		System.out.println("notNow: " + notNow);

		// Date ==> sử dụng chủ yếu để lưu trữ
		// ==> phương thức xử lý --> Deprecated

		// singleton design pattern
		// idea: một class chỉ cho phép tạo ra duy nhất 1 đối tượng
		// time=1664197993253, ZoneInfo[id="Asia/Bangkok",
		// firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=8,
		// WEEK_OF_YEAR=40,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=269,
		// DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,
		// MINUTE=13,SECOND=13,MILLISECOND=253,
		Calendar cNow = Calendar.getInstance();
		System.out.println("cNow --> " + cNow);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH); // c: fields[Calendar.DAY_OF_MONTH]
		int month = cNow.get(Calendar.MONTH) + 1;
		int year = cNow.get(Calendar.YEAR);
		String currentDate = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println("cNow date: " + currentDate);

		Calendar cNotNow = Calendar.getInstance();
		// DayOfWeek: 1(Sunday), 2(Monday)-->7(Saturday)
		// 17/8/1999 --> dayOfWeek = ?(6), dayOfYear = ?(260)

		System.out.println("cNotNow before --> " + cNotNow);
		// set specify fields
		cNotNow.set(1999, Calendar.AUGUST, 17);

		// cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
		// nếu không setTime(--> computeFields())
		// --> toString sẽ in ra thông tin lỗi

		System.out.println("cNotNow after --> " + cNotNow);

		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("cNotNow dayOfWeek: " + dayOfWeek);
		System.out.println("cNotNow dayOfYear: " + dayOfYear);

		System.out.println("==================================");
		// + 2. Giờ 12-24, Phút, Giây hiện tại
		String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) + ":" + cNotNow.get(Calendar.MINUTE) + ":"
				+ cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: " + hms);

		System.out.println("==================================");
		// + 3. Thứ ngày, tuần trong tháng/năm
		// 3.1 --> In ra thứ hiện tại(JAVA --> int) --> Text
		// 1(Chủ nhật), 2(Thứ hai), --- 7(Thứ bảy)

		// 3.2 --> In ra tuần thứ mấy trong tháng/năm hiện tại
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("cNow dow: " + dow);

		// TODO: Enumeration
		String[] weekdays = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
		System.out.println("dayOfWeek: " + weekdays[dow - 1]);

		System.out.println("weekOfMonth: " + cNotNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOfYear: " + cNotNow.get(Calendar.WEEK_OF_YEAR));

		System.out.println("======================");
		// + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		cNow.set(Calendar.MONTH, Calendar.OCTOBER);
		int cMonth = cNow.get(Calendar.MONTH) + 1;
		// c.getActualMaximum(field)
		// --> Lấy giá trị lớn nhất của field thông qua dữ liệu trong c
		int daysInMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + cMonth + " has " + daysInMonth + " days");

		// --> Trái đất --> 365 ngày 6 giờ --> Tây
		// --> --> Âm nhuận 1 tháng
		// 2023 --> Dương lịch --> ko phải năm nhuận
		// 2023 --> Âm lịch --> năm nhuận
		// + 5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2020));

		// + 6. Ngày đầu tiên trong tuần là thứ mấy với locale(phụ thuộc)
		// US, Canada, Japan: FDOW --> 1
		// Others --> 2
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		// Locale(language, country)
		System.out.println("US FDOW: " + c1.getFirstDayOfWeek());

		// "10/10/1990"
		// 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		System.out.println("default locale: " + Locale.getDefault());
		
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER, 5);
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		
		today.add(Calendar.DAY_OF_MONTH, tfdow-tdow);
		
		System.out.println("today: " + today);
		// ==> 8. In ra danh sách các ngày trong tuần hiện tại
		// Epoch time
	}

}
