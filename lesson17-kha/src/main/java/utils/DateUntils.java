package utils;

import java.time.LocalDate;
import java.util.Objects;

public class DateUntils {
	private DateUntils() {

	}

	public static java.sql.Date toDate(LocalDate localDate) {
		Objects.requireNonNull(localDate, "Local Date cannot null");
		return java.sql.Date.valueOf(localDate);
	}

}
