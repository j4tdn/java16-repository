package localdatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex01LocalDate {
	private static final String  PATTERN= "dd/mm/yy";

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("now:" +now);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(PATTERN);
		String txnow = df.format(now);
		System.out.println("now:" +txnow);

	}

}
