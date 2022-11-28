package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
		
		//Lấy thông tin thời gian với timezone
		//	+ 1. Ngày, Tháng, Năm hiện tại
		// Mon Sep 26 19:53:20 ICT 2022
		// ITC: Indochina time = UTC+7 ==> TimeZone
		Date now =new Date();
		System.out.println("now: "+now);
		
		// @Deprecated == outDate ==> Should not use
		// Epoch = Unix Time = January 1,1970, 00:00:00 GMT
		// date(7200): millionseconds since epoch time
		Date notNow = new Date(-999999999);
		System.out.println("not now: "+notNow);
		
		//Date ==> sử dụng chủ yếu để lưu trữ
		//	   ==> các phương thức xử lý --> Deprecated
		
		// singleton design pattern 
		// ideal: một class chỉ cho phép tạo ra duy nhất 1 đối tượng
		// time=1664197932995,ZoneInfo[id="Asia/Bangkok"
		
		Calendar cNow = Calendar.getInstance(); 
		System.out.println("c "+cNow);
		cNow.get(Calendar.DAY_OF_MONTH); //c: fields[Calendar.DAY_OF_MONTH]
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);
		int month = cNow.get(Calendar.MONTH)+1;
		int year = cNow.get(Calendar.YEAR);
		String curentDate =" "+dayOfMonth+"/"+month+"/" +year;
		System.out.println("curent date: "+ curentDate);
		
		Calendar cNotNow = Calendar.getInstance();
		//17/08/1999 --> dayOfWeek,dayOfYear = ?
		cNotNow.set(1999, Calendar.AUGUST, 17);
		int cdayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int cdayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("============");
		System.out.println(cNotNow);
		System.out.println("C not now: "+ cdayOfWeek);
		System.out.println("C not now: "+ cdayOfYear);
		
		//	+ 2. Giờ 12-24, Phút, Giây
		System.out.println("============");
		String hms =""
				+ cNotNow.get(Calendar.HOUR_OF_DAY)+":"
				+ cNotNow.get(Calendar.MINUTE)+":"
				+ cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: "+hms);
		
		//	+ 3. Thứ ngày, tuần/ngày trong tháng, năm
		// 3.1--> In ra  thứ hiện tại --> Text
		// 3.2 --> In ra tuần thứ mấy trong tháng/năm hiện tại
		System.out.println("============");
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(dow);
		
		String[] weekdays = {"Chủ Nhật","Thứ Hai","Thứ Ba","Thứ Tư","Thứ Năm","Thứ Sáu","Thứ Bảy"};
		System.out.println("day of week: "+weekdays[dow-1]);
		
		System.out.println("week of month: "+cNotNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("week of month: "+cNotNow.get(Calendar.WEEK_OF_YEAR));
        //	+ 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		System.out.println("============");
		int dayinmonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month "+month+" has "+dayinmonth+" day");
		
		
		//	+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
		System.out.println("============");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("is leap year: "+gc.isLeapYear(2022));
		
		//	+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale
		Calendar c1= Calendar.getInstance(new Locale("vi","VN"));
		//locale(language,country)
		System.out.println("US FDOW: "+c1.getFirstDayOfWeek());
		
		
        //	+ 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		Locale.setDefault(Locale.FRANCE);
		System.out.println("default locale: "+Locale.getDefault());
		
		Calendar today = Calendar.getInstance();
		today.set(2022,Calendar.OCTOBER,19);
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		//System.out.println("today fdow: "+today.getFirstDayOfWeek());
		today.add(Calendar.DAY_OF_MONTH, tfdow-tdow);		
		System.out.println("today: "+today);
		
		
        //	+8 In ra danh sách các ngày trong tuần hiện tại
		System.out.println("========== Current weeks days ==========");
		
		//	=>>> Epoch time
		
	}
}
