package view;

import java.time.LocalDate;

public class Ex04 {
	private static String[] dayOffs = {"2/9", "1/5", "30/4"};
	public static void main(String[] args) {
		LocalDate startDay = LocalDate.of(2022, 6, 7);
		LocalDate endDay = startDay;
		for(int i = 0; i < 110; i++) {
			 if(!isDayOff(endDay) || endDay.getDayOfWeek().toString() != "SATURDAY" || endDay.getDayOfWeek().toString() != "SUNDAY") {
				 endDay = endDay.plusDays(1);
			 }
		}
		System.out.println("Finish day: " + endDay);
	}
	
	private static boolean isDayOff(LocalDate date) {
		for (String dayOff: dayOffs) {
            int day = Integer.parseInt(dayOff.split("/")[0]);
            int month = Integer.parseInt(dayOff.split("/")[1]);
            if(date.getDayOfMonth() == day && date.getMonthValue()  == month) {
            	  return true;
            }

        }
        return false;
	}
	
}
