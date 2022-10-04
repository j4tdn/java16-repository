package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {

	public static void main(String[] args) {
		// Ex01: Lấy thông tin thời gian với timezone
		// + 1. Ngày, Tháng, Năm hiện tại
		// Now: Mon Sep 26 19:53:17 ICT 2022
		// ICT: Indochina time = UTC +7 ==>TimeZone
		Date now = new Date();
		System.out.println("Now: " + now);

		// Deprecated == OutDate ==>Should not use
		Date notNow = new Date(-999999999);
		System.out.println("NotNow: " + notNow);

		// Date ==> Sử dụng chủ yếu để lưu trữ
		// ==> phương thức xử lý --> Deprecated

		// singleton design pattern
		// idea: một class chỉ cho phép tạo ra duy nhất 1 đối tượng
		Calendar cNow = Calendar.getInstance();
		System.out.println("c " + cNow);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);
		int month = cNow.get(Calendar.MONTH) + 1;
		int year = cNow.get(Calendar.YEAR);
		String currentDate = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println("current date: " + currentDate);

		Calendar cNotNow = Calendar.getInstance();
		// 17/8/1999 --> dayOfWeek=?, dayOfYear=?
		cNotNow.set(1999, Calendar.AUGUST, 17);
		cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
		System.out.println("cNotNow --> " + cNotNow);
		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("cNotNow dayofWeek: " + dayOfWeek);
		System.out.println("cNotNow dayofYear: " + dayOfYear);

		// + 2. Giờ 12-24, Phút, Giây
		String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) + ":" + cNotNow.get(Calendar.MINUTE) + ":"
				+ cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: " + hms);

		// + 3. Thứ ngày, tuần/ngày trong tháng, năm
		// 3.1 --> In ra thứ hiện tại -->Text
		// 3.2 --> In ra tuần thứ mấy trong tháng/năm hiện tại
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("dow: " + dow);
		String[] weekdays = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };
		System.out.println("dayOfweek: " + weekdays[dow - 1]);
		System.out.println("weekOfMonth: " + cNotNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOfYear: " + cNotNow.get(Calendar.WEEK_OF_YEAR));

		// + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		cNow.set(Calendar.MONTH, Calendar.OCTOBER);
		int cMonth = cNow.get(Calendar.MONTH) + 1;
		// getActualMaximum(field) --> Lấy giá trị lớn nhất của field thông qua dữ liệu
		// trong c
		int daysInMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + cMonth + " has " + daysInMonth + " days ");

		// + 5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2020));

		// + 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		// US, CANADA, JAPAN: FDOW --> 1
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		// Locale(language, country)
		System.out.println("US FDOW: " + c1.getFirstDayOfWeek());

		// + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		System.out.println("=====================");
		System.out.println("default locale: " + Locale.getDefault());
		Locale.setDefault(Locale.FRANCE);
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER, 19);
		int fdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		today.add(Calendar.DAY_OF_MONTH, fdow - tdow);
		System.out.println("today: " + today);

		// + 8. In ra danh sách các ngày trong tuần hiện tại
		System.out.println("======= Current week days ========");
		
		// =>>> Epoch time

	}

}
