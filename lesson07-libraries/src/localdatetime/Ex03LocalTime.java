package localdatetime;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalTime {
	private static final String PATTERN="hh:mm:ss a";
	public static void main(String[] args) {
		//LocalTime chỉ chứa giờ phút giây
		
		LocalTime now=LocalTime.now();
		System.out.println("now: " +now);//now: 12:53:33.996571500
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern(PATTERN);
		System.out.println("formatted: " +df.format(now));//formatted: 12:53:33 PM
	}

}
