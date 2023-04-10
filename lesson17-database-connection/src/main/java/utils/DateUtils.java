package utils;

import java.time.LocalDate;

public class DateUtils {
	private DateUtils() {
		
	}
	
	/**
	 *  Convert localdate to sql date
	 * 
	 * @param ldate
	 * @return converted sql date
	 */
	
	public static java.sql.Date toSDate(LocalDate ldate) {
		return java.sql.Date.valueOf(ldate);
	}
	
}
