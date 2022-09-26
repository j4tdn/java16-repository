package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
		
		 // Ex01:
		         //  Lấy thông tin thời gian với timezone
	//+ 1. Ngày, Tháng, Năm
		Date now = new Date();
		System.out.println("now: "+ now);
		// ICT : Indochina time = UTC +7
		// @Deprecated == outdate
		Date notNow = new Date(1664197942);
		System.out.println("notNow: "+ notNow);
		
		// Date ==> su dung để lưu trữ 
		//      ==> phương thức xử lý -->Deprecated
		// sungleton design pattern
		// idea: 1 class chỉ cho phép tạo ra duy nhất 1 đối tượng
		// time=1664198047094,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Saigon",offset=25200000,dstSavings=0,useDaylight=false,transitions=11,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=8,WEEK_OF_YEAR=40,WEEK_OF_MONTH=5,DAY_OF_MONTH=26,DAY_OF_YEAR=269,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=14,SECOND=7,MILLISECOND=94,ZONE_OFFSET=25200000,DST_OFFSET=0]
		Calendar c = Calendar.getInstance();
		System.out.println("c: "+c);
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		String currentDate = " " + dayOfMonth + "/" + month + "/" + year;
		System.out.println("cNow date: "+ currentDate);
		// 17/08/1999 --> dayOfWeek = ?, dayOfYear =?
		
		Calendar cNotNow = Calendar.getInstance();
		cNotNow.set(1999,Calendar.AUGUST,17);
		System.out.println("cNotNow: "+ cNotNow);
		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("cNotNow dayOfWeek: "+dayOfWeek);
		System.out.println("cNotNow dayOfYear: "+dayOfYear);
		
    //+ 2. Giờ 12-24, Phút, Giây
		
		String hms = ""
				+cNotNow.get(Calendar.HOUR_OF_DAY) + ":"
				+cNotNow.get(Calendar.MINUTE) + ":"
				+cNotNow.get(Calendar.SECOND) ;
		System.out.println("HMS: "+ hms);
	//+ 3. Thứ ngày, tuần/ngày trong tháng, năm
	// 3.1  --> In ra thứ hiện tại --> Text
	// 3.2  --> In ra tuần thứ mấy trong tháng/năm hiện tại
		
		
		int dow = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("cNow dow: "+ dow);
		
		String[] weekdays = { "Chủ Nhật","Thứ Hai","Thứ Ba","Thứ Tư","Thứ Năm","Thứ Sáu ","Thứ Bảy"};
		System.out.println("dayOfWeek: "+ weekdays[dow-1]);
		
		System.out.println("weekOfMonth: "+ cNotNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOYear: "+ cNotNow.get(Calendar.WEEK_OF_YEAR));
		
    //+ 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		
		int cMonth = c.get(Calendar.MONTH) +1;
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);//lấy giá trị lớn nhất hiện tại trong field
		
		System.out.println("Month " + cMonth + " has " + daysInMonth + " days ");
	//+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: "+gc.isLeapYear(2020));
	//+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		
		Calendar c1 = Calendar.getInstance(new Locale("vi","VN"));
		System.out.println("US FDOW: "+ c1.getFirstDayOfWeek());
    //+ 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
    // ==> In ra danh sách các ngày trong tuần hiện tại   
    //=>>> Epoch time
		 
	}

}
