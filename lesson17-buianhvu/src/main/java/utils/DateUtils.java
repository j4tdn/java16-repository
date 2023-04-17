package utils;

import java.time.LocalDate;

public class DateUtils {

	private DateUtils() {
		
	}
	
	public static java.sql.Date toDate(LocalDate d) {
		return java.sql.Date.valueOf(d);
		
	}
}
