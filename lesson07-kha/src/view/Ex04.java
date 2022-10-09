package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex04 {

    private static String[] Holiday = {"2/9", "1/5", "30/4"};
    public static void main(String[] args) {
        deadLine(LocalDate.of(2022, 7, 6), 110);
    }

    private static void deadLine(LocalDate dateStart, int dayLefts){
        System.out.println("Begin : " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dateStart));
        int count = 0;
        while(count < dayLefts){
            if(dateStart.getDayOfWeek().compareTo(DayOfWeek.SATURDAY) != 0 && dateStart.getDayOfWeek().compareTo(DayOfWeek.SUNDAY) != 0 && !isHoliday(dateStart))
                count++;
            dateStart = dateStart.plusDays(1);
        }
        System.out.println("DeadLine : " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dateStart));
    }

    private static boolean isHoliday(LocalDate date){
        for (String holiday: Holiday) {
            int day = Integer.parseInt(holiday.split("/")[0]);
            int month = Integer.parseInt(holiday.split("/")[1]);

            if(date.getDayOfMonth() == day && date.getMonth().getValue() == month) return true;
        }
        return false;
    }

}
