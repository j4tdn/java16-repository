package view;
import java.time.LocalDate;
import java.time.Period;
public class Ex01TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		LocalDate dateStart = LocalDate.now().withDayOfMonth(1).withMonth(1).withYear(2022);
		System.out.println("dateStart: " + dateStart);

		LocalDate dateEnd = LocalDate.now();

		if (dateStart.isAfter(dateEnd)) {
			throw new IllegalArgumentException("date start cannot exceed date end");
		}
		Period period = Period.between(dateStart, dateEnd);
		System.out.println("period: " + period);
		System.out.println("ToString:" + optional(period.getYears(), "years") + optional(period.getMonths(), "months")
				+ optional(period.getDays(), "days"));
	}

	private static String optional(int dmy, String unit) {
		return dmy > 0 ? dmy + " " + unit + " " : " ";
	}
}
