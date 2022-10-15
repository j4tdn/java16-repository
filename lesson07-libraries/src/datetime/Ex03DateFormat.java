package datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * Date : lưu trữ
 * Calendar: lưu trữ + xử lý
 * 
 * In ra phải get nhiều rất mệt
 * -->Dùng DateFormat
 * -->định dạng luôn khi in ra
 * ==>df.format(date)-->String
 * ==>df.parse(String) -->Date
 * 
 * format chỉ hỗ trợ chuyển của Date
 * ==> convert Calendar-->Date
 */

public class Ex03DateFormat {
	public static void main(String[] args) {
		//Calendar, date, String
		//đặt pattern
		
		//		String pattern ="dd/MM/yyyy" lấy ra ngày tháng năm
		String pattern ="dd/MM/yyyy EEEE hh:mm:ss a";//HH:mm:ss-->24h
		//EEEE hiện thứ ngày
		DateFormat df= new SimpleDateFormat();//Format cho Calendar
		//dòng 440
		Calendar c= Calendar.getInstance();// (1)
		Date date = c.getTime();//convert c từ Calendar sang Date
		String formatted = df.format(date);//để in ngày tháng năm cho đẹp hơn
		System.out.println(formatted);
		
		System.out.println("========================");
		//cho String-->Date-->Calendar
		
		
		String birthdayAsString ="18/07/1990";
		df=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date parsedDate = df.parse(birthdayAsString);// 1
			Calendar parsedCalendar = Calendar.getInstance(); //convert Date-->Calendar
			parsedCalendar.setTime(parsedDate);
			
			System.out.println(parsedCalendar);// 2
			System.out.println(parsedDate);
		} catch (ParseException e) {

			e.printStackTrace();
		}
		
	}

}
