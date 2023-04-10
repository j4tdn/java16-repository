package utils;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateUtils {
	public DateUtils() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * convert localdate to sql date
	 * 
	 * @param ldate ldate
	 * @return covered sql date
	 */
	
	public static java.sql.Date toSDate(LocalDate ldate){
		return java.sql.Date.valueOf(ldate);
	}
	
	public static LocalTime toLTime(java.sql.Time sTime) {
		return sTime.toLocalTime();
	}
}