package localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDate {
	private static final String PATTERN = "dd/MM/yyyy E";
	public static void main(String[] args) {
        LocalDate now = LocalDate.now();  //lấy thời gian hiện tại
        
        System.out.println("time now: " + now);
        
       DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
       String text = df.format(now);
       System.out.println("formatted date: " + text);
		
	}
}
