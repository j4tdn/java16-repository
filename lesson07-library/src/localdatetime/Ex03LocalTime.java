package localdatetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex03LocalTime {
	
	private static final String PATTERN = "HH:mm:ss a";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
		String text = dtf.format(now);
		System.out.println("Formatted time: " + text);
		
		
	}

}
