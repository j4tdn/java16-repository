package view;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.*;
import java.util.concurrent.CancellationException;

public class Ex03 {
    private static final String PATTERN = "dd/MM/yyy HH:mm:ss";

    public static void main(String[] args) {
        System.out.println("Current Time At Random Location : ");
        currentTimeAtRandomLocale();
        System.out.println("\n");
        System.out.println("Last Day of Month : ");
        lastDayOfMonth(2022, 10, 6);
        System.out.println("\n");
        System.out.println("First and Last Day of Current Week : ");
        firstANDlastDayOfWeek();
        System.out.println("\n");
        System.out.println("Day in Week Of Year : ");
        dayInWeekOfYear();
        System.out.println("\n");
        System.out.println("20 Days left : ");
        dayAfterNDay(20);
        System.out.println("\n");
        System.out.println("Time your life : ");
        timeYourLife();
        System.out.println("\n");
    }
    private static void currentTimeAtRandomLocale(){
        String[] listLocale = TimeZone.getAvailableIDs();
        //Arrays.stream(listLocale).forEach(System.out::println);
        Random rd = new Random();
        int Locale = rd.nextInt(listLocale.length);
        System.out.println(listLocale[Locale]);
        System.out.println("--------------------JAVA07-----------------------");
        Calendar cNow = Calendar.getInstance(TimeZone.getTimeZone(listLocale[Locale]));
        SimpleDateFormat df = new SimpleDateFormat(PATTERN);
        df.setTimeZone(cNow.getTimeZone());
        System.out.println(df.format(cNow.getTime()));
        System.out.println("--------------------JAVA08-----------------------");
        LocalDateTime ldtNow = LocalDateTime.now(TimeZone.getTimeZone(listLocale[Locale]).toZoneId());
        System.out.println(DateTimeFormatter.ofPattern(PATTERN).format(ldtNow));
    }
    private static void lastDayOfMonth(int year, int month, int date){
        System.out.println("--------------------JAVA07-----------------------");
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, date);
        c.get(1);
        c.set(Calendar.DAY_OF_MONTH,c.getActualMaximum(Calendar.DAY_OF_MONTH) );
        System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(c.getTime()));
        System.out.println("--------------------JAVA08-----------------------");
        LocalDate ld = LocalDate.of(year, month, date);
        System.out.println(DateTimeFormatter.ofPattern("dd/MM/yyyy").format(ld.withDayOfMonth(ld.lengthOfMonth())));
    }
    private static void firstANDlastDayOfWeek(){
        System.out.println("--------------------JAVA07-----------------------");
        Calendar cNow = Calendar.getInstance();
        int firstDay = cNow.getFirstDayOfWeek();
        Calendar cFirst = Calendar.getInstance();
        cFirst.set(Calendar.DAY_OF_WEEK, firstDay);
        cFirst.get(1);
        Calendar cLast = Calendar.getInstance();
        cLast.setTimeInMillis(cFirst.getTimeInMillis());
        cLast.add(Calendar.DAY_OF_WEEK, 6);
        System.out.println(new SimpleDateFormat(" E dd/MM/yyyy").format(cFirst.getTime()));
        System.out.println(new SimpleDateFormat(" E dd/MM/yyyy").format(cLast.getTime()));
        System.out.println("--------------------JAVA08-----------------------");
        LocalDate ldNow = LocalDate.now();
        LocalDate firstLDay = ldNow.with(WeekFields.of(Locale.getDefault()).dayOfWeek(), 1);
        LocalDate lastLDay = firstLDay.plusDays(6);
        System.out.println(DateTimeFormatter.ofPattern(" E dd/MM/yyyy").format(firstLDay));
        System.out.println(DateTimeFormatter.ofPattern(" E dd/MM/yyyy").format(lastLDay));
    }
    private static void dayInWeekOfYear(){
        System.out.println("--------------------JAVA07-----------------------");
        Calendar cNow = Calendar.getInstance();
        System.out.println(cNow.get(Calendar.WEEK_OF_YEAR));
        System.out.println("--------------------JAVA08-----------------------");
        LocalDate ldNow = LocalDate.now();
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = ldNow.get(weekFields.weekOfYear());
        System.out.println(weekNumber);
    }
    private static void dayAfterNDay(int date){
        System.out.println("--------------------JAVA07-----------------------");
        Calendar cNow = Calendar.getInstance();
        System.out.println("Current : " + new SimpleDateFormat(" EEEE dd/MM/yyyy").format(cNow.getTime()));
        cNow.add(Calendar.DAY_OF_YEAR, date);
        System.out.println("After " + date + " Days : " + new SimpleDateFormat(" EEEE dd/MM/yyyy").format(cNow.getTime()));
        System.out.println("--------------------JAVA08-----------------------");
        LocalDate ldNow = LocalDate.now();
        System.out.println("Current : " + DateTimeFormatter.ofPattern(" EEEE dd/MM/yyyy").format(ldNow));
        ldNow = ldNow.plusDays(date);
        System.out.println("After " + date + " Days : " + DateTimeFormatter.ofPattern(" EEEE dd/MM/yyyy").format(ldNow));
    }
    private static void timeYourLife(){
        DateCustomes<Calendar> FirstDate = new DateCustomes<>(Calendar.getInstance());
        FirstDate.input("Your Birth");
        FirstDate.untilNow();
        DateCustomes<LocalDate> SecondDate = new DateCustomes<>(LocalDate.now());
        SecondDate.input("Your Birth");
        SecondDate.untilNow();
    }
}
