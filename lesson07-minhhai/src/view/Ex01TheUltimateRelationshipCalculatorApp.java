package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculatorApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LocalDateTime startDate = LocalDateTime.of(2015, 1, 8, 20, 21, 0);

		LocalDateTime endDate = LocalDateTime.of(0, 0, 0, 0, 0, 0);
		;
		System.out.println("Did they Break up?" );
		String ip = sc.next();
		if (ip.equals("y") || ip.equals("Y")) {
			endDate = LocalDateTime.of(2017, 3, 8, 14, 4, 3);

		} else if (ip.equals("n") || ip.equals("N")) {
			endDate = LocalDateTime.now();
		}

		LocalDate startDatingDate = startDate.toLocalDate();
		LocalTime startDatingTime = startDate.toLocalTime();

		LocalDate endDatingDate = endDate.toLocalDate();
		LocalTime endDatingTime = endDate.toLocalTime();

		Period period = Period.between(startDatingDate, endDatingDate);
		Duration duration = Duration.between(startDatingTime, endDatingTime);

		System.out.println("Dating time of the couple is: " + period.getYears() + "." + period.getMonths()
				+ ".\n" + period.getDays() + "." + duration.toHours() + " "
				+ duration.toMinutesPart() + ":" + duration.toSecondsPart());

	}

}
