package localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex05LocalDateTime {
public static void main(String[] args) {
	private static final String PATTERN = "dd/MM/yyyy'T'HH:mm:ss";
	
	LocalDateTime now = LocalDateTime.now();
	System.out.println("now:"+ now);
	DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
	System.out.println("formatted:"+ df.format(now));

	
}
}
