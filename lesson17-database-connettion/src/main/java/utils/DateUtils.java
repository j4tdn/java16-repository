package utils;

import java.time.LocalDate;

public class DateUtils {
	
	private DateUtils() {
	}
	
	public static java.sql.Date toSDate(LocalDate lDate){
		return java.sql.Date.valueOf(lDate);
	}

}
