package view;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ex01UltimateRelationshipCalculator {
    static String[] formatDates = {"yyyy.M.d H:m:s", "yyyy-M-d H:m:s", "yyyy/M/d H:m:s", "yyyy_M_d H:m:s"};
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=================The Ultimate Relationship Calculator===============");
        LocalDateTime FirstDate = input("first");
        LocalDateTime EndDate = LocalDateTime.now();
        boolean isBreakUp = false;
        do{
            System.out.println("Are you break up ? (Y/N)");
            String tmp = sc.nextLine();
            if(tmp.equals("Y") || tmp.equals("N") || tmp.equals("y") || tmp.equals("n")){
                if(tmp.equals("Y") || tmp.equals("y")){
                    isBreakUp = true;
                    EndDate = input("end");
                }
                break;
            }
            System.out.println("Please enter valid value");
        }while(true);

        if(!EndDate.isAfter(FirstDate)){
            System.out.println("EndDate must be less than startDay");
            return;
        }
        Period period = Period.between(FirstDate.toLocalDate(), EndDate.toLocalDate());
        Duration duration = Duration.between(FirstDate.toLocalTime(), EndDate.toLocalTime());
        if(duration.isNegative()){
            period = period.minusDays(1);
            duration = duration.plusDays(1);
        }

        DayOfWeek firstDayOfRelationship = FirstDate.getDayOfWeek();
        System.out.print("First Date of Relationship: ");
        System.out.println(firstDayOfRelationship.getValue()==7 ? "Chu Nhat" : "Thu " + (firstDayOfRelationship.getValue()+1));
        System.out.print("the relationship has been started for : \n");
        System.out.println(period.getYears() > 0 ? period.getYears() + " year\n" : ""
                         + (period.getMonths() > 0 ? period.getMonths() + " month\n" : "")
                         + (period.getDays() > 0 ? period.getDays() + " day\n" : "")
                         + (duration.toHoursPart() > 0 ? duration.toHoursPart() + " hours\n" : "")
                         + (duration.toMinutesPart() > 0 ? duration.toMinutesPart() + " munutes\n" : "")
                         + (duration.toSecondsPart() > 0 ? duration.toSecondsPart() + " seconds" : ""));
    }

    private static LocalDateTime input(String text){
        String dateAsText = "";
        LocalDateTime rs;
        do{
            System.out.println("Enter the " + text +  " day of relationship( year/month/day, year.month.day, year-month-day,.... ):");
            dateAsText = sc.nextLine();
            rs = isValidDate(dateAsText);
            if(rs != null) break;
        }while(true);
        return rs;
    }

    private static LocalDateTime isValidDate(String dateAsText){
        for (String pattern : formatDates) {
            try{
                return LocalDateTime.parse(dateAsText, DateTimeFormatter.ofPattern(pattern));
            }catch (DateTimeParseException e){
            }
        }
        System.out.println("please enter valid date with format");
        return null;
    }
}

