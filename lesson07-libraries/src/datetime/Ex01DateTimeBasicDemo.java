package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
		
		// Ex01: Lấy thông tin thời gian với timezone
		// + 1. Ngày, Tháng, Năm
		Date now = new Date();
		// now: Mon Sep 26 19:53:20 ICT 2022
		// ICT: Indochina time = UTC + 7 ==> Timezone
		System.out.println("now: " + now);
		
		// @Deprecated = OutDate ==> should not use
		// Epoch = Unix Time = January 1, 1970, 00:00:00 GMT 
		// date(7200): milliseconds since epoch time
		Date notnow = new Date(-72000000);
		System.out.println("not now: " + notnow);
		
		// Date ==> sử dụng chủ yếu để lưu trữ
		//      ==> phương thức xử lí --> Deprecated
		
		Calendar cNow = Calendar.getInstance();
		System.out.println("c --> " + cNow);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH); // c: field[Calendar.DAY_OF_MONTH]
		int month = cNow.get(Calendar.MONTH) + 1;
		int year = cNow.get(Calendar.YEAR);
		String currentDate = " " + dayOfMonth + "/" + month + "/" + year;
		System.out.println("cNow date: " + currentDate);
		
		Calendar cNotNow = Calendar.getInstance();
		System.out.println("cNotNow before: " + cNotNow );
		// set specify fields
		// 17/9/1999 --> dayOfWeek = ?, dayOfYear = ?
		cNotNow.set(1999, Calendar.SEPTEMBER, 17 );
		cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
		// Nếu không setTime(--> computerDields())
		// --> toString sẽ in ra thông tin lỗi
		System.out.println("cNotNow after: " + cNotNow );
		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("cNotNow dayOfWeek: " + dayOfWeek);
		System.out.println("cNotNow dayOfYear: " + dayOfYear);
		
		System.out.println("====================================");
		// singleton design pattern
		// idea: một class chỉ cho phép tạo duy nhất 1 đối tượng
		// time=1664198040951,ZoneInfo[id="Asia/Bangkok"
		// firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1
		// YEAR=2022,MONTH=8,WEEK_OF_YEAR=40,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,
		// DAY_OF_YEAR=269,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,
		// HOUR_OF_DAY=20,MINUTE=14,SECOND=0,MILLISECOND=951
		
		
		
		// + 2. Giờ 12-24, Phút, Giây
		String hms = ""
				+ cNotNow.get(Calendar.HOUR_OF_DAY) + ":"
				+ cNotNow.get(Calendar.MINUTE) + ":"
				+ cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: " + hms);
				
		// + 3. Thứ ngày, tuần trong tháng/năm
		// 3.1 --> in ra thứ hiện tại
		// 3.1 --> in ra tuần thứ mấy trong tháng/năm hiện tại
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("cNow dow: " + dow);
		// TODO: Enumeration
		String[] weekdays = {"Chủ nhật", "Thứ hai", "thứ ba", "Thứ tư"
								, "Thứ năm", "Thứ sáu", "Thứ bảy"};
		System.out.println("dayOfWeek: " + weekdays[dow-1]);
		
		System.out.println("weekOfMonth: " + cNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOfYear: " + cNow.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("====================================");

	    // + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		cNow.set(Calendar.MONTH, Calendar.OCTOBER);
		int cMonth = cNow.get(Calendar.MONTH) + 1;
		// getActualMaximum(field) --> lấy giá trị lớn nhất của field thông qua dữ liệu trong c
		int daysInMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + cMonth + " has " + daysInMonth + "days");
		
		System.out.println("====================================");

		// + 5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2022));
		
		System.out.println("====================================");

		// + 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.println("VN firt day of week: " + c1.getFirstDayOfWeek());
		
		System.out.println("====================================");

	    // + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		Locale.setDefault(Locale.FRANCE);
		System.out.println("default locale: " + Locale.getDefault());
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER, 19);
		System.out.println("today flow: " + today.getFirstDayOfWeek());
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		
		today.add(Calendar.DAY_OF_MONTH, tfdow - tdow);
		System.out.println("today: " + today);
		
	    // + 8. In ra danh sách các ngày trong tuần hiện tại   
		System.out.println("============= Current weeks day ============");
		
	    // =>>> Epoch time
		
		
	}
}
