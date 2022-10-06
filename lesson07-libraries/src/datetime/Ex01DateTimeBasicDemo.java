package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
		
	//Ex01: Lấy thông tin thời gian với timezone
	//+ 1. Ngày, Tháng, Năm hiện tại
		// now :Mon Sep 26 19:53:35 ICT 2022
		// ICT : Indochina time = UTC+7 ==> TimeZone
		Date now = new Date();
		System.out.println("now: " + now);
		
		// @Deprecated == OutDate ==> Should not use
		//Epoch = Unix Time - 
		//Date notnow = Date
		//System.out.println("notnow: " + notnow);
		
		// Date ==> sử dụng chủ yếu để lưu trữ
		//    	==> phương thức xử lý ==> Deprecated
		
		//singleton design pattern
		// idea: 1 class chỉ cho phép tạo ra duy nhất 1 đối tượng 
		//time=1664198181542,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Bangkok",
		//firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=8,
		//WEEK_OF_YEAR=40,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=269,
		//DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,
		//MINUTE=16,SECOND=21,MILLISECOND=542,
		Calendar c = Calendar.getInstance();
		System.out.println("c --> " + c);
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH); // c: feilds[Calendar.DAY_OF_MONTH]
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		String currentDate = " " + dayOfMonth + "/" +month+ "/" + year;
		System.out.println("c Date: " + currentDate );
		
		Calendar cNow = Calendar.getInstance();
		// DayOfWeek: 1 , 2 , 7
		// 178/1999 ==> dayOfWeek?, dayOfYear?
		System.out.println("cNow --> " + cNow);
		// set specify fields
		
		//cNow.set(1999, Calendar.AUGUST, 17);
		
		//cNow.setTimeInMillis(cNow.getTimeInMillis());
		// nếu không setTime(--> computeFields())
		// --> tostring sẽ in ra thông tin lỗi
		System.out.println("cNow --> " + cNow);

		int dayOfWeek = cNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("cNow --> " + dayOfWeek);
		System.out.println("cNow --> " + dayOfYear);
		
		System.out.println("============");
		
		String HMS = " "
				+ cNow.get(Calendar.DAY_OF_WEEK) + ":"
				+ cNow.get(Calendar.MONTH ) + ":"
				+ cNow.get(Calendar.YEAR);
			System.out.println("HMS: " + HMS);
	//+ 2. Giờ 12-24, Phút, Giây
		String hms = " "
				+ cNow.get(Calendar.HOUR_OF_DAY)+ ":"
				+ cNow.get(Calendar.MINUTE) + ":"
				+ cNow.get(Calendar.SECOND) ;
		System.out.println("hms: " + hms);
	//+ 3. Thứ ngày, tuần trong tháng/ năm
		//3.1 in ra thứ hiện tại
		//3.2 in ra tuần thứ mấy trong tháng/năm hiện tại
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("DOW --> " + dow);
		
		String[] weekdays = {"Chủ Nhật", "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy"};
		
		System.out.println("dayofweek: " + weekdays[dow-1]);
		
		System.out.println("weekofmonth: " + cNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekofmonth: " + cNow.get(Calendar.WEEK_OF_YEAR));
		
		
    //+ 4. Đếm số ngày tháng, năm hiện tại >> Calendar
			cNow.set(Calendar.MONTH, Calendar.OCTOBER);
			int cMonth = cNow.get(Calendar.MONTH) + 1;
			// getActualMaximum(field) --> lấy giá trị lớn nhất của field thông qua dữ liệu trong c
			int dayInMonth = cNow.getActualMaximum(Calendar.DAY_OF_YEAR);
			System.out.println("Month" + cMonth + "has" + dayInMonth + "days");
			
	//+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
			// 2023 --> Dương lịch : không phải năm nhuận
			// 2023 --> Âm lịch : năm nhuận
			// trái đất --> 365 ngày 6 giờ --> Tây
			GregorianCalendar gc = new GregorianCalendar();
			System.out.println("isLeapYear: " + gc.isLeapYear(2022	));
			
	//+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale
			// US, Canada, Japan: FDOW --> 1
		Calendar c1 = Calendar.getInstance(new Locale("en","US"));
		System.out.println("US dow: "+ c1.getFirstDayOfWeek());
			
			System.out.println("=========");
   // + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		System.out.println("default: " + Locale.getDefault());
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER, 19);
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		
		today.add(Calendar.DAY_OF_WEEK, tfdow-tdow);
		System.out.println("TODAY: " + today);
		
		System.out.println("=========");
    //==> In ra danh sách các ngày trong tuần hiện tại   
	//=>>> Epoch time
		
		
		
	}
}
