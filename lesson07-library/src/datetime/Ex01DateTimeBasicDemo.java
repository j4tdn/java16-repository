package datetime;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
		
		 //+ 1. Ngày, Tháng, Năm
		 Date now = new Date();
		 System.out.println(now);
		 Date notnow = new Date(720000000);
		 System.out.println(notnow);
		 Calendar c = Calendar.getInstance();
		 System.out.println(c);
		 int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		 int month = c.get(Calendar.MONTH) + 1;
		 int year = c.get(Calendar.YEAR);
		 System.out.println(dayOfMonth + "/" + month + "/" + year );
		 
		 Calendar cnotnow = Calendar.getInstance();
		 // set specify fileds
		 cnotnow.set(1999, Calendar.AUGUST, 17);
		 System.out.println(cnotnow);
		 cnotnow.setTimeInMillis(cnotnow.getTimeInMillis());
		 
		 System.out.println("ss" + cnotnow);
		 int dayOfWeek = cnotnow.get(Calendar.DAY_OF_WEEK);
		 int dayOfYear = cnotnow.get(Calendar.DAY_OF_YEAR);
		 System.out.println(dayOfWeek);
		 System.out.println(dayOfYear);
		 //@deprecated = outdate
	     // 2. Giờ 12-24, Phút, Giây
		 String hms = "" + cnotnow.get(Calendar.HOUR_OF_DAY) + ":"
				 + cnotnow.get(Calendar.MINUTE) + ":"
				 + cnotnow.get(Calendar.SECOND);
		 System.out.println(hms);
	     // 3. Thứ ngày, tuần/ngày trong tháng, năm
		 int dow = c.get(Calendar.DAY_OF_WEEK);
		 System.out.println(dow);
		 
		 String[] weeksday = {"Chủ nhật" , "Thứ hai", "Thứ ba", "Thứ tư", " Thứ năm", "Thứ sáu", "Thứ bảy"};
		 System.out.println(weeksday[dow - 1]);
		 System.out.println(cnotnow.get(Calendar.WEEK_OF_MONTH));
		 System.out.println(cnotnow.get(Calendar.WEEK_OF_YEAR));
		 
		 c.set(Calendar.MONTH, Calendar.NOVEMBER);
		 int CMonth = c.get(Calendar.MONTH) + 1;
		 int dssd = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		 System.out.println(CMonth + "/" + dssd);
         // 4. Đếm số ngày tháng, năm hiện tại >> Calendar
	     // 5. Kiểm tra năm hiện tại có phải năm nhuận không
		 GregorianCalendar gc = new GregorianCalendar();
		 System.out.println("gc : " + gc.isLeapYear(2020));
		 
	     // 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		 Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		 System.out.println(c1.getFirstDayOfWeek());
         // 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		 Locale.setDefault(Locale.FRANCE);
		 System.out.println("default locale" + Locale.getDefault());
		
		 Calendar today = Calendar.getInstance();
		 today.set(2022, Calendar.OCTOBER, 19);
		 int tfdow = today.getFirstDayOfWeek();
		 int tfdow1 = today.get(Calendar.DAY_OF_MONTH);
		 today.add(Calendar.DAY_OF_MONTH, tfdow - tfdow1);
		 System.out.println("===");
		 System.out.println(today);
         // In ra danh sách các ngày trong tuần hiện tại
		 
		 //
	}

}
