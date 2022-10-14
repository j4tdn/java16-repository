package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
		//	Ex01: Lấy thông tin thời gian với timezone
//	+ 1. Ngày, Tháng, Năm
		// Mon Sep 26 19:53:16 ITC 2022
		// ITC: Indochina time = UTC + 7 => TimeZone: giờ Đông Dương
		System.out.println("1. Ngày, Tháng, Năm");
		Date now = new Date();
		System.out.println("Now: " + now);
		
		// @deprecated == out date => should not use
		//Epoch =  unix Time = January 1, 1970 , 00:00:00 GMT 
		//date(7200): miliseconds sinse epoch time
		Date notNow = new Date(7200);
		System.out.println("Not Now: " + notNow);
		
		//Date:  sử dụng chủ yếu để lưu trữ
		//    => Phương thưc sử lý Deprecated
		
		//Singleton design pattern
		//idea: 1 class chie cho phep tạo ra 1 đối tượng
		Calendar cNow = Calendar.getInstance();
		System.out.println("C ---> " + cNow);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);
		int month = cNow.get(Calendar.MONTH) + 1;
		int year = cNow.get(Calendar.YEAR);
		String currentDate = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println("cNow Date: " + currentDate);
		
		//DayOfWeek: 1(Sunday) 2(mon) 7(sat)
		//17/08/1999
		//set specify fields
		Calendar cNotNow = Calendar.getInstance();
		cNotNow.set(1999, Calendar.AUGUST, 17);
		
		//cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
		//Nếu k setTime (--> computerFields())
		//--> toString sẽ in ra lỗi
		
		System.out.println("c Not Now: " + cNotNow);
		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("Day of week: " + dayOfWeek);
		System.out.println("Day of year: " + dayOfYear);
		
		
		
//	+ 2. Giờ 12-24, Phút, Giây
		System.out.println("==============================================");
		System.out.println("2. Giờ 12-24, Phút, Giây");
		String hms =""
				+ cNotNow.get(Calendar.HOUR_OF_DAY)+":"
				+ cNotNow.get(Calendar.MINUTE)+":"
				+ cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: "+hms);
	 
//	+ 3. Thứ ngày, tuần/ngày trong tháng, năm
		System.out.println("==============================================");
		System.out.println("3. Thứ ngày, tuần/ngày trong tháng, năm");
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("cNow dow: "+ dow);
		
		String[] weekdays = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
		System.out.println("dayOfWeek: " + weekdays[dow-1]);
		
		System.out.println("weekOfMonth: " + cNotNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOfYear: " + cNotNow.get(Calendar.WEEK_OF_YEAR));
		
// + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		System.out.println("==============================================");
		System.out.println("4. Đếm số ngày tháng, năm hiện tại >> Calendar");
		int cMonth = cNow.get(Calendar.MONTH)+1;
		//c.getActualMaximum(field);
		//Lấy giá trị lớn nhất của field thông qua dữ liệu trong c
		int dayInMonth = cNotNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + cMonth + " has " + dayInMonth + " days.");
		
		
//		+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
		//--> Trái đất -> 365 ngày 6 giờ --> Tây
		//--> 			Âm nhuận 1 tháng
		//2023 --> dương lịch --> k phải năm nhuận
		//2023 --> Âm lịch --> năm nhuận
		
		System.out.println("==============================================");
		System.out.println("5. Kiểm tra năm hiện tại có phải năm nhuận không");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2020));
		
//		+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		//US, Canada, Japan:1.  Other 2
		System.out.println("==============================================");
		System.out.println("6. Ngày đầu tiên trong tuần là thứ mấy với locale");
		Calendar c1 = Calendar.getInstance((new Locale("vn", "VN")));
		//Locale(language, country)
		System.out.println("US FDOW: " + c1.getFirstDayOfWeek());
// + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		System.out.println("==============================================");
		System.out.println("7. Ngày đầu tiên trong tuần hiện tại là ngày mấy");
		Locale.setDefault(Locale.FRANCE);
		System.out.println("Default locate: "+Locale.getDefault());
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER, 5);
		
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_MONTH);
		
		today.add(Calendar.DAY_OF_MONTH, tfdow - tdow);
		System.out.println();
		System.out.println("Today fdow: " + today.getFirstDayOfWeek());
//+8 In ra danh sách các ngày trong tuần hiện tại   
		//	=>>> Epoch time
		System.out.println("==============================================");
		System.out.println("8 Current week days ");
		
		
		

			
		
	}

}
