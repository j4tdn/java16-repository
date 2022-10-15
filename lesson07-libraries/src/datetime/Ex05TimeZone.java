package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

//dùng đơn vị là UTC(cordinated universal time)
public class Ex05TimeZone {
	//java 7
	
	private static DateFormat df= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public static void main(String[] args) {
		System.out.println("default timezone " +TimeZone.getDefault());
		//trình bày timezone trong máy
		
		Calendar c=Calendar.getInstance();
		System.out.println("default time: " +format(c, TimeZone.getDefault()));
		
		System.out.println("\n=====================\n");
		//lấy timezone ở 1 nơi khác
		//in ra tất cả timezone mà trong máy 
		
		String[] ids= TimeZone.getAvailableIDs();
		for(String id: ids) {
			System.out.println(id);
		}
		//Europe/Kiev
		//lấy timezone ở Kiev
		
		Calendar kiev=Calendar.getInstance(TimeZone.getTimeZone("Europe/kiev"));
		System.out.println("kiev time: " +format(kiev, TimeZone.getTimeZone("Europe/kiev")));
	}                                           //c
	
	private static String format(Calendar c, TimeZone tz) {
		df.setTimeZone(tz);

		return df.format(c.getTime());
	}

}
