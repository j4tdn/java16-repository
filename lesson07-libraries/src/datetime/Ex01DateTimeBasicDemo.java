package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) throws InterruptedException {
		//
		//Lấy thông tin thời gian với timezone
		//  + 1. Ngày, Tháng, Năm
		Date now = new Date();
		System.out.println("now: " + now);
		
		Date notNow = new Date(-999999999);
		System.out.println("notNow: " + notNow);
		
		// Date ==> su dung chu yeu de luu tru
		//		==> phuong thuc xu ly --> Deprecated
		
		// singleton design pattern
		// idea: mot class chi cho phep tao ra duy nhat 1 doi tuong
		
		
		Calendar cNow = Calendar.getInstance();
		System.out.println("cNow --> " + cNow);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);
		int month = cNow.get(Calendar.MONTH)+1;
		int year = cNow.get(Calendar.YEAR);
		String CurrentDate = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println("cNow date " + CurrentDate);
		
		Calendar cNotNow = Calendar.getInstance();
		// 17/8/1999 --> dayOfWeek = ? , dayOfYear = ?
		cNotNow.set(1999,Calendar.AUGUST, 17);
		System.out.println("cNotNow --> " + cNotNow);
		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("cNotNow dayOfWeek: " + dayOfWeek);
		System.out.println("cNotNow dayOfYear: " + dayOfYear);
		
		System.out.println("====================================");
		
		
		
		//	+ 2. Giờ 12-24, Phút, Giây
			cNotNow.set(Calendar.SECOND, Calendar.getInstance().get(Calendar.SECOND));
		String hms = ""
				+ cNotNow.get(Calendar.HOUR_OF_DAY) + " : "
				+ cNotNow.get(Calendar.MINUTE) + " : "
				+ cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: " + hms);
		
		
				
		//	+ 3. Thứ ngày, tuần/ngày trong tháng, năm
		//  3.1. --> In ra thu hien tai --> Text
		//  3.2. --> In ra tuan thu may trong thang/ nam hien tai
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println("cNow dow: " + dow);
		
		String[] weekdays = {"Chu Nhat" , "Thu hai" , "Thu ba" , "Thu tu",
							 "Thu nam" ,"Thu sau", "Thu bay"};
		System.out.println("dayOfWeek: " + weekdays[dow - 1]);
		
		System.out.println("weekOfMonth: " + cNotNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOfYear: " + cNotNow.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("==================================");
		
        //	+ 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		cNow.set(Calendar.MONTH, Calendar.OCTOBER);
		int cMonth = cNow.get(Calendar.MONTH)+1;
		int daysInMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + cMonth + " has " + daysInMonth + " days");
		// --> Trái Đất --> 365 ngày 6 giờ --> Tâu
		// --> 			--> Âm Nhuận 1 tháng
		// 2023 --> Dương lịch --> năm nhuận 
		// 2023 --> Âm lịch --> năm nhuận		
		//	+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2020));
		//	+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale(phụ thuộc)
		// US,Canada,Japan: FDOW --> 1
		// Others: --> 2
		Calendar c1 = Calendar.getInstance(new Locale("vi" , "VN"));
		// Locale(langua , country)
		System.out.println("US FDOW: " + c1.getFirstDayOfWeek());
		System.out.println("=======================================");
        //	+ 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		System.out.println("default locale:" +Locale.getDefault());
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER,5);
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		
		today.add(Calendar.DAY_OF_MONTH, tfdow -tdow);
		System.out.println("today: " + today);
        //	+ 8. In ra danh sách các ngày trong tuần hiện tại 
		System.out.println("============ Current week days ==========");
		
		// Epoch time
		 
	}
}
