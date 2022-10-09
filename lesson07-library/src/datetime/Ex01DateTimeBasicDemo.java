package datetime;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.stream.IntStream;

public class Ex01DateTimeBasicDemo {
	static enum date{
		SUNDAY,
		MONDAY,
		TUESDAYS,
		WEDNESDAY,
		THURSDAY,
		PRIDAY,
		SATURDAY,
	}
	public static void main(String[] args) {
//		Ex01: Lấy thông tin thời gian với timezone
//			+ 1. Ngày, Tháng, Năm
			Date dateNow = new Date();
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd, MM, yyyy");
			System.out.println(dateFormat.format(dateNow));
			System.out.println("=======================================");
//			+ 2. Giờ 12-24, Phút, Giây
			SimpleDateFormat timeFormat = new SimpleDateFormat("hh, mm, ss");
			System.out.println(timeFormat.format(dateNow));
			System.out.println("=======================================");
//			+ 3. Thứ ngày, tuần/ngày trong tháng, năm
			Calendar cNow = Calendar.getInstance();
			Date date1 = cNow.getTime();
			int DATE = cNow.get(Calendar.DAY_OF_WEEK);
			System.out.println(date.values()[DATE-1]);
			System.out.println("=======================================");
//		   	+ 4. Đếm số ngày tháng, năm hiện tại >> Calendar
			cNow = Calendar.getInstance();
			System.out.println(cNow.getActualMaximum(Calendar.DAY_OF_MONTH));
			System.out.println("=======================================");
//			System.out.println("4");
//			Calendar cNotNow = Calendar.getInstance();
//			//cNotNow.setTime(new Date(1999, 8, 17));
//			cNotNow.set(1999, Calendar.AUGUST, 17);
//			cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
//			System.out.println(cNotNow);
//			System.out.println(cNotNow.get(Calendar.DAY_OF_WEEK));
//			System.out.println(cNotNow.get(Calendar.DAY_OF_YEAR));
//			+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
			cNow = Calendar.getInstance();
			cNow.set(Calendar.YEAR, 2024);
			cNow.set(Calendar.MONTH, Calendar.FEBRUARY);
			
			int DayOfYear = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println(DayOfYear == 29 ? "Nhuận" : "Không nhuận");
			System.out.println("=======================================");
//			+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale
			cNow = Calendar.getInstance(new Locale("vi", "VN"));
			System.out.println(cNow.getFirstDayOfWeek());
			System.out.println("=======================================");
//        	+ 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
			cNow = Calendar.getInstance(new Locale("vi", "VN"));
			cNow.set(Calendar.DAY_OF_WEEK, cNow.getFirstDayOfWeek());
			System.out.println(cNow.get(Calendar.DATE));
			System.out.println("=======================================");
//        ==> In ra danh sách các ngày trong tuần hiện tại 
			//TH1
			//cNow = Calendar.getInstance(new Locale("vi", "VN"));
			//TH2
			cNow = Calendar.getInstance(Locale.ENGLISH);
			cNow.set(2022, Calendar.OCTOBER, 19);
			cNow.set(Calendar.DAY_OF_WEEK,cNow.getFirstDayOfWeek());
			System.out.println(cNow.get(Calendar.DATE));
			cNow.add(Calendar.DAY_OF_WEEK, 1); 
			System.out.println(cNow);
			for (int i = 0; i < 7; i++) {
				System.out.println(cNow); 
				cNow.add(Calendar.DAY_OF_WEEK, 1); 
			}
//		=>>> Epoch time
		 
	}
	
	
	
	
}
