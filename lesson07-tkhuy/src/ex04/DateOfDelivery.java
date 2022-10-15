package ex04;
import java.time.LocalDate;
public class DateOfDelivery {
	public static void main(String[] args) {
		LocalDate dayStart =LocalDate.of(2022, 6, 7);
		LocalDate dayPlan = dayStart;
		for(int day=0;day<110;day++) {
			if(dayPlan.getDayOfWeek().toString()!="SATURDAY" || dayPlan.getDayOfWeek().toString()!="SUNDAY") {
				dayPlan=dayPlan.plusDays(1);
			}
		}
		System.out.println(dayPlan);
	}
}
