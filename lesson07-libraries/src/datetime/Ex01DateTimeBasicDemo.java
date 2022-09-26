package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Ex01: Lấy thông tin thời gian với timezone
		//	now: Mon Sep 26 19:53:16 ICT 2022
		//	ICT: Indochina time = UTC+7 ==>TimeZone
		//		+ 1. Ngày, Tháng, Năm
		Date now = new Date();
		System.out.println("now: " + now);
		
		// @Deprecated == OutDate ==> Should not use
		// Epoch = Unix Time = January 1, 1970, 00:00:00 GMT
		//date(7200): milliseconds since epoch time
		Date notnow = new Date(1664197940243l);
		System.out.println("not now: " + notnow);
		
		//Date ==> sử dụng chủ yếu để lưu trữ
		//	   ==> phương thức xử lý --> Deprecated
		
		Calendar cNow = Calendar.getInstance();
		System.out.println("c --> " + cNow);	
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH); // c: fields[Calendar.DAY_OF_MONTH]
		int month = cNow.get(Calendar.MONTH) + 1;
		int year = cNow.get(Calendar.YEAR);
		String currentDate = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println(currentDate);
		//c --> time=1664198008172,zone=sun.util.calendar.ZoneInfo[id="Asia/Ho_Chi_Minh",firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=8,WEEK_OF_YEAR=40,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=269,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=13,SECOND=28,MILLISECOND=172,ZONE_OFFSET=25200000,DST_OFFSET=0]

		Calendar cNotNow = Calendar.getInstance();
		// DayOfWeek: 1(Sunday), 2(Monday) --> 7(Saturday)
		// 17/08/1999 --> dayOfWeek = ?, dayOfYear = ?
		// set specify fields
		cNotNow.set(1999, Calendar.AUGUST, 17);
		cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
		System.out.println("cNotNow --> " + cNotNow);
		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("cNotNow dayOfWeek: " + dayOfWeek);
		System.out.println("cNotNow dayOfYear: " + dayOfYear);
		System.out.println("============================================");

	//		+ 2. Giờ 12-24, Phút, Giây
		String hms = ""
				+ cNow.get(Calendar.HOUR_OF_DAY) + ":"
				+ cNow.get(Calendar.MINUTE) + ":"
				+ cNow.get(Calendar.SECOND);
		System.out.println("HMS: " + hms);
	
	//		+ 3. Thứ ngày, tuần/ngày trong tháng, năm
		//			- 3.1 In ra thứ hiện tại --> Text
		//			- 3.2 In ra thứ mấy trong tháng/năm hiện tại
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("cNow dow: " + dow);
		
		// TODO: Enumeration
		String[] weekdays = {"", "Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm",
							 "Thứ Sáu", "Thứ Bảy"};
		System.out.println("dayOfWeek: " + weekdays[dow]);
		
		System.out.println("weekOfMonth: " + cNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOfYear: " + cNow.get(Calendar.WEEK_OF_YEAR));
		
     //		+ 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		cNow.set(Calendar.MONTH,Calendar.OCTOBER);
		int cMonth = cNow.get(Calendar.MONTH);
		// getActualMaximum(field) --> lấy giá trị lớn nhất của field thông qua dữ liệu trong c
		int daysInMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + (cMonth + 1) + " has " + daysInMonth + " days");
		
	//		+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
		// 2023 --> Dương Lịch --> ko phải năm nhuận
		// 2023 --> Âm Lịch --> năm nhuận
		// Tây --> trái đất 1 vòng -> 365 ngày 6 giờ
		// Âm --> nhuận 1 tháng
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2022));
		
		
		
	//		+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale (phụ thuộc)
		//US, Canada, Japan: FDOW --> 1
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.println("US FDOW: " + c1.getFirstDayOfWeek());
		
		
		
    //		+ 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
        //==> In ra danh sách các ngày trong tuần hiện tại   
//=>>> Epoch time
		
	}

}
