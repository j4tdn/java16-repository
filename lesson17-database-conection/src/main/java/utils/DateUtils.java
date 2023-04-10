package utils;

import java.time.LocalDate;

public class DateUtils {
	private DateUtils () {
		
	}
	
	/*
	 * Convert localdate to sql date
	 * @param ldate
	 * 
	 */
	
	public static java.sql.Date toDate(LocalDate sellDate) {
		return java.sql.Date.valueOf(sellDate);
	}
}
