package utils;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateUtils {
	private DateUtils() {
	}
	
	/*
	 * 
	 */
	
	public static java.sql.Date toSDate(LocalDate ldate) {
		return java.sql.Date.valueOf(ldate);
	}
	
	public static java.sql.Time toSTime(LocalTime lTime) {
		return java.sql.Time.valueOf(lTime);
	}
	
	public static LocalTime toLTime(java.sql.Time sTime) {
		return sTime.toLocalTime();
	}
}
