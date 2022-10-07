package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
		//	+ 1. Ngày, Tháng, Năm hiện tại
		Date now = new Date();
		System.out.println("now: " + now);
		// Mon Sep 26 19:55:44 ICT 2022
		// ICT -> múi h Đông Dương (Indochina Timezone) = UTC+7 
		@SuppressWarnings("deprecation")
		Date notNowDeprecated = new Date(2002, 05, 07);
		System.out.println(notNowDeprecated);
		Date notNow = new Date(7200); 
		// Date(long date)  
			// date : the milliseconds since January 1, 1970, 00:00:00 GMT
			// Epoch = Unix Time = January 1, 1970, 00:00:00 GMT
		System.out.println(notNow);
		// Date -> sử dụng để lưu trữ
		// 		-> phương thức xử lý đã bị deprecated
		
		Calendar cNow = Calendar.getInstance(); // singleton -> ko có dùng new để khởi tạo đ/tg
		System.out.println("c: " + cNow);
		System.out.println(cNow.get(Calendar.DAY_OF_MONTH)); // c.get(int field)
		System.out.println(cNow.get(Calendar.MONTH) + 1); // because month here is 0-11
		
		Calendar cNotNow = Calendar.getInstance(); // 05/07/2002
		cNotNow.set(2002, Calendar.JULY, 05);
		System.out.println(cNotNow.get(Calendar.DAY_OF_YEAR));
//		cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
//		System.out.println(cNotNow.get(Calendar.DAY_OF_YEAR));
//		setTimeMillis(...) -> có hàm computeFields() -> tính lại mọi fields
		
		
//		--------------------------------------------------------------
		//	+ 2. Giờ 12-24, Phút, Giây
		// Calendar.HOUR --> 12 ; Calendar.HOUR_OF_DAY --> 24
		String hms = "cNotNow hms: " 
				+ cNotNow.get(Calendar.HOUR_OF_DAY) + ":"
				+ cNotNow.get(Calendar.MINUTE) + ":"
				+ cNotNow.get(Calendar.SECOND);
		System.out.println(hms);	
		
//		---------------------------------------------------------------
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
		System.out.println("Default locale: " + Locale.getDefault());
		Locale.setDefault(Locale.FRANCE);
		Calendar today = Calendar.getInstance();
		today.set(2022,  Calendar.OCTOBER, 19);
		System.out.println("today fdow: " + today.getFirstDayOfWeek());
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		
		today.add(Calendar.DAY_OF_MONTH, tfdow-tdow);
		System.out.println("today: " + today);
		
    //==> In ra danh sách các ngày trong tuần hiện tại   
	//==> Epoch time
	}

}