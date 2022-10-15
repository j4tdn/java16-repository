package datetime;

import java.rmi.registry.LocateRegistry;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {

		//+ 1. lấy Ngày, Tháng, Năm hiện tại
		//now : Sat Oct 01 21:01:39 ICT 2022
		//ICT: indochina time=UTC+7==>time zone
		Date now=new Date();
		System.out.println("now : " +now);
		
		//@Deprecated: đã bị loại bỏ=OutDate==> không khuyên dùng
		//Date notNow=new Date(2020, 02, 20);
		//Epoch=Unix Time = January 1, 1970, 00:00:00 GMT.: mốc thời gian
		//date(7200): milliseconds kể từ epoch time
		Date notNow=new Date(72000000);
		System.out.println("now" +notNow);
		
		//Date  ==> sử dụng chủ yếu để lưu trữ
		//      ==> xử lý-->Deprecated
		
		//singleton design pattern
		//idea: 1 class chỉ cho phép tạo ra duy nhất 1 đối tượng
		//time=1664678469499,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,
		//MONTH=9,WEEK_OF_YEAR=41,WEEK_OF_MONTH=2,DAY_OF_MONTH=2,DAY_OF_YEAR=275,
		//DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=41,SECOND=9,
		//MILLISECOND=499,ZONE_OFFSET=25200000,DST_OFFSET=0]
		
		Calendar cNow= Calendar.getInstance();//lấy ngày hiện tại
       System.out.println("cNow--> " +cNow);//c :thuộc tính fields[Calendar.DAY_OF_MONTH]
       int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);//lấy ra năm, ngày trong tháng ...
       int month = cNow.get(Calendar.MONTH) +1;
       int year = cNow.get(Calendar.YEAR);
       String currentDate = "" + dayOfMonth + "/" + month + "/" + year;
       System.out.println("cNow date" +currentDate);
       
       Calendar cNotNow =Calendar.getInstance();
       //17/08/1999--> dayOfWeek=? dayOfYear=?
       //set chỉ sửa lại giá trị, không hỗ trợ tính toán
       cNotNow.set(1999, 7, 17);
       
       //nếu không setTime--> toString sẽ in ra thông tin lỗi
       //cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
       //cho toString cập nhật
       
       System.out.println("cNotNow -->" +cNotNow);
       int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
       int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
       System.out.println("dayOfWeek " +dayOfWeek);
       System.out.println("dayOfYear " +dayOfYear);
       
       System.out.println("=====================================");
		//+ 2. Giờ 12-24, Phút, Giây
        String hms =""
        		+ cNotNow.get(Calendar.HOUR_OF_DAY) + ":"
        		+ cNotNow.get(Calendar.MINUTE) + ":"
        		+ cNotNow.get(Calendar.SECOND);
        System.out.println("HSM" +hms);
       
		//+ 3. Thứ ngày, tuần/ngày trong tháng, năm
		//3.1--> In ra thứ hiện tại(JAVA -->int)-->Text
        //in ra  chủ nhật--> thứ 2 -->......thứ 7
		
        int dow = cNow.get(Calendar.DAY_OF_WEEK);//in ra thứ mấy trong tuần
        System.out.println("cNow dow " +dow);
        
        String [] weekdays= {"chu nhat", "thu 2", "thu 3", "t4","t5","t6","t7"};
        
        System.out.println("day of week" +weekdays[dow -1]);
      //3.2 --> in ra tuần thứ mấy trong tháng/năm hiện tại
        System.out.println("weekofmonth" +cNotNow.get(Calendar.WEEK_OF_MONTH));//tuần trong tháng
        
		System.out.println("==============================");
	    //    + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		cNow.set(Calendar.MONTH, Calendar.OCTOBER);
		int cmonth= cNow.get(Calendar.MONTH)+1;//in ra tháng hiện tại
		//c.getActualMaximum(field)--> lấy giá trị lớn nhất của field
		//qua dữ liệu trong c
		int daysInMonth=cNow.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("month" +cmonth +"has" +daysInMonth);
        
		//+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
		GregorianCalendar gc =new GregorianCalendar();

		System.out.println("isLeapYear " +gc.isLeapYear(2020));
		//+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale(phụ thuộc)
		Calendar c1= Calendar.getInstance(Locale.US);
		Calendar c2= Calendar.getInstance(new Locale("vi", "VN"));
		//locale(language, country)
		System.out.println("US: " +c1.getFirstDayOfWeek());
		System.out.println("VN: " +c2.getFirstDayOfWeek());
		System.out.println("=============================================");
		
		
	      //  + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		Locale.setDefault(Locale.FRANCE);
		System.out.println("defaut locate " +Locale.getDefault());
		//lấy locale mặc định
		Calendar today= Calendar.getInstance();//lấy ngày hiện tại
		today.set(2022, Calendar.OCTOBER, 5);//đặt lại ngày
		//System.out.println("today" +today.getFirstDayOfWeek()); tìm ngày đầu tuần theo locale
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		
		today.add(Calendar.DAY_OF_MONTH, tfdow-tdow);
		System.out.println("today " +today);
		
		
	        //8. In ra danh sách các ngày trong tuần hiện tại
		System.out.println("=======================================");
		
	//=>>> Epoch time
	}

}
