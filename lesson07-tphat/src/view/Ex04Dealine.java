package view;

import java.time.LocalDate;

public class Ex04Dealine {

	public static void main(String[] args) {
		LocalDate dateStart = LocalDate.of(2022, 6, 7);
		LocalDate datePlan = dateStart;
		for (int day = 0; day < 110; day++) {
			if (datePlan.getDayOfWeek().toString() != "SATURDAY" || datePlan.getDayOfWeek().toString() != "SUNDAY") {
				datePlan = datePlan.plusDays(1);
			}
		}
		System.out.println(datePlan);
	}
}
