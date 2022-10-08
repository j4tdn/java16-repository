package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {

		// * Lấy thông tin thời gian với timezone
		// + 1. Ngày, Tháng, Năm hiện tại
		// Mon Oct 03 15:48:26 ICT 2022
		// ICT: Indochina Time = UTC + 7 ==> TimeZone
		Date now = new Date();
		System.out.println("now: " + now);

		// @Deprecated == OutDate == Should not use
		// Epoch = Unix time = January 1, 1970, 00:00:00 GMT
		// Date(7200): milliseconds since epoch time
		Date notNow = new Date(7200000);
		System.out.println("Not now: " + notNow);

		// Date ==> Sử dụng chủ yếu để lưu trữ
		// ==> Phương thức xử lý ==> Deprecated

		// singleton design pattern
		// idea: 1 class chỉ cho phép tạo ra duy nhất một đối tượng
		Calendar cNow = Calendar.getInstance();
		System.out.println("c--> " + cNow);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH); // c: fields[Calendar.DAY_OF_MONTH]
		int month = cNow.get(Calendar.MONTH) + 1;
		int year = cNow.get(Calendar.YEAR);
		String currentDate = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println("cNow date: " + currentDate);

		Calendar cNotNow = Calendar.getInstance();
		// 17/08/1999 --> dayOfWeek = ?, dayOfYear = ?
		// DayOfWeek: 1(Sunday), 2(Monday)-->7(Saturday)
		cNotNow.set(year, Calendar.AUGUST, 17);
		System.out.println("cNotNow Date: " + cNotNow);

		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);

		System.out.println("cNotNow dayOfWeek: " + dayOfWeek);
		System.out.println("cNotNow dayOfYear: " + dayOfYear);

		// nếu không setTime(--> computeFields())
		// --> toString sẽ in ra thông tin lỗi
		cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
		System.out.println("cNotNow After: " + cNotNow);
		System.out
				.println("==========================================================================================");
		// + 2. Giờ 12-24, Phút, Giây
		String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) + ":" + cNotNow.get(Calendar.MINUTE) + ":"
				+ cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: " + hms);
		System.out
				.println("==========================================================================================");
		// + 3. Thứ ngày, tuần trong tháng/năm
		// 3.1 --> In ra thứ hiện tại --> Text
		// 1(Chủ nhật), 2(Thứ 2) --> 7(Thứ bảy)
		// 3.2 --> In ra thứ mấy trong tháng/năm hiện tại
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("CNow dow: " + dow);

		String[] weeksday = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };

		System.out.println("dayOfWeek: " + weeksday[dow - 1]);
		System.out
				.println("==========================================================================================");

		System.out.println("weekOfMonth: " + cNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOfYear: " + cNow.get(Calendar.WEEK_OF_YEAR));
		System.out
				.println("==========================================================================================");
		// + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		int cMonth = cNow.get(Calendar.MONTH);
		// getActualMaximum(filed) --> Lấy giá trị lớn nhất của field thông qua dữ liệu
		// trong c
		int dayInMonth = cNow.getActualMaximum(dayOfMonth);
		System.out.println("cMonth: " + (cMonth + 1));
		System.out.println("dayInMonth: " + dayInMonth);
		System.out
				.println("==========================================================================================");
		// + 5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2022));
		System.out
				.println("==========================================================================================");
		// + 6. Ngày đầu tiên trong tuần là thứ mấy với locale(phụ thuộc)
		// US, Canada, Japan: FDOW --> 1
		// Other: 2
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		// Locale(language, country)
		System.out.println("VN FDOW: " + c1.getFirstDayOfWeek());
		System.out
				.println("==========================================================================================");
		// + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		Locale.setDefault(Locale.FRANCE);
		System.out.println("default locate: " + Locale.getDefault());
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER, 19);
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);

		today.add(Calendar.DAY_OF_MONTH, tfdow - tdow);
		System.out.println("today: " + today);

		// + 8 ==> In ra danh sách các ngày trong tuần hiện tại
		System.out.println("==========CURRENT WEEK DAYS==========");
		
		// =>>> Epoch time

	}

}
