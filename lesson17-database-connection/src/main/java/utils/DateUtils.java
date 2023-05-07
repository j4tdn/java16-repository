package utils;

import java.time.LocalDate;

public class DateUtils {
	public DateUtils() {
		/**
		 * Convert localdate to sql date
		 * 
		 * 
		 */
	}
	
	public static java.sql.Date toDate(LocalDate ldate){
		return java.sql.Date.valueOf(ldate);
	}
}
