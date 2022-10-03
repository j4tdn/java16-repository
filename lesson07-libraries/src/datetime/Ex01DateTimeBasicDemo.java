package datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.print.CancelablePrintJob;
import javax.print.attribute.standard.Fidelity;

public class Ex01DateTimeBasicDemo {
	public static void main(String[] args) {
//	Lấy thông tin thời gian với timezone
//	+ 1. Ngày, Tháng, Năm hiện tại
		
		Date now = new Date();
		System.out.println("date now: "  + now);
		
	   // ICT: Indochina time - giờ âm dương = UTC+7 ==>TimeZone
		
		//@Deprecated = OutDate ==> Should not use
		// Epoch = Unix Time = January 1, 1970, 00:00:00 GMT
		
		Date notNow = new Date(72000000);
		
		//7200 là milliseconds since epoch time
		
		System.out.println("not Now : " + notNow);
		
		// Date ==> sử dụng chủ yếu để lưu trữ
		// phương thức xử lí --> Deprecated
		
		//singleton design pattern
		// idea: một class chỉ cho phép tạo ra duy nhất một đối tượng
		
		Calendar cNow = Calendar.getInstance();
		
		System.out.println("c --> " + cNow);
		int dayOfMonth = cNow.get(Calendar.DAY_OF_MONTH);// c: fields[Calendar.DAY_OF_MONTH]
		
		int month = cNow.get(Calendar.MONTH) + 1;
		
		int year = cNow.get(Calendar.YEAR);
		
		String currentDate = "" + dayOfMonth + "/" + month + "/" + year;
		System.out.println("Current date: " + currentDate);
		
		Calendar cNotNow = Calendar.getInstance();
		// 17/8/1999 --> dayOfWeek = ?, dayOfYear = ?
		cNotNow.set(1999, Calendar.AUGUST, 17);
		// Set specify fields
		
		//cNotNow.setTimeInMillis(cNotNow.getTimeInMillis());
		// Nếu không setTime (--> computeFields()) --> toString sẽ in ra thông tin lỗi
		
		System.out.println("cNotNOw: " + cNotNow);
		
		
		int dayOfWeek = cNotNow.get(Calendar.DAY_OF_WEEK);
		int dayOfYear = cNotNow.get(Calendar.DAY_OF_YEAR);
		System.out.println("Day Of Week: " + dayOfWeek);
		System.out.println("Day Of Year: " + dayOfYear);
		System.out.println("=========================================================");
		
		
			
//============================================================================		
//		+ 2. Giờ 12-24, Phút, Giây
		String hms = "" + cNotNow.get(Calendar.HOUR_OF_DAY) + ":" 
                        + cNotNow.get(Calendar.MINUTE) +":"
                        + cNotNow.get(Calendar.SECOND);
		System.out.println("HMS: " + hms);
		System.out.println("=========================================================");
			
//=============================================================================		
//		+ 3. Thứ ngày, tuần trong tháng, năm
//        3.1 --> In ra thứ ngày hiện tại
//		  3.2 --> In ra tuần thứ mấy trong tháng/năm hiện tại
		
		int dow = cNow.get(Calendar.DAY_OF_WEEK);
		
		// TODO: Enumeration
		String[] weekdays = {"Chủ nhật", "Thứ hai", " Thứ ba", " Thứ năm", "Thứ sáu","Thứ bảy"};
		System.out.println("dow: " + weekdays[dow-1]);
		System.out.println("weekOfMonth: " + cNotNow.get(Calendar.WEEK_OF_MONTH));
		System.out.println("weekOfYear: " + cNotNow.get(Calendar.WEEK_OF_YEAR));
	
		System.out.println("=========================================================");

//============================================================================
//	    + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		int cMonth = cNow.get(Calendar.MONTH) + 1;
		
		//getActualMaximum(field) --> lấy giá trị lấn nhất của field thông qua dữ liệu trong c
		int daysInMonth = cNow.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("Month " + cMonth + " has " + daysInMonth + " days");
		System.out.println("=========================================================");
//============================================================================
//		+ 5. Kiểm tra năm hiện tại có phải năm nhuận không
		
		//Trái đất: 365 ngày 6 giờ --> Tây
		//2023: Dương lịch -> ko phải năm nhuận
		//      Âm lịch -> năm nhuận
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("isLeapYear: " + gc.isLeapYear(2020));
		System.out.println("=========================================================");
		
//============================================================================
//		+ 6. Ngày đầu tiên trong tuần là thứ mấy với locale ( phụ thuộc )
		Calendar c1 = Calendar.getInstance(new Locale("vi", "VN"));
		System.out.println("US FDOW: " + c1.getFirstDayOfWeek());
		System.out.println("=========================================================");
		
		
//============================================================================
//	    + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
	   
		System.out.println("Default locale: " + Locale.getDefault());
		Locale.setDefault(Locale.FRANCE);
		Calendar today = Calendar.getInstance();
		today.set(2022, Calendar.OCTOBER, 19);
		
		
		//Cách 1
		int tfdow = today.getFirstDayOfWeek();
		int tdow = today.get(Calendar.DAY_OF_WEEK);
		today.add(Calendar.DAY_OF_MONTH, tfdow - tdow);
		System.out.println("today: " + today);
		
//	    + 8. In ra danh sách các ngày trong tuần hiện tại   
		System.out.println("=========== Curent week days ============");
		//Ex02
	//=>>> Epoch time : liên kết giữa date và calendar
		
		
		
		
	}
}
