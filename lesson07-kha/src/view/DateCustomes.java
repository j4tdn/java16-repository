package view;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;

public class DateCustomes<T> {
    private T date = null;
    String[] formatDates = {"d.M.yyyy", "d-M-yyyy", "d/M/yyyy", "d_M_yyyy", "d M yyyy"};

    public DateCustomes(T date){
        this.date = date;
    }

    public void input(String text){
        Scanner sc = new Scanner(System.in);
        String dateAsText = "";
        do{
            System.out.println("Enter " + text + " Date");
            dateAsText = sc.nextLine();
            for (String pattern : this.formatDates) {
                try{
                    if(this.date.getClass().equals(LocalDate.class)){
                        date = (T) LocalDate.parse(dateAsText, DateTimeFormatter.ofPattern(pattern));
                    }else if(this.date.getClass().equals(GregorianCalendar.class)){
                        Calendar parseCalender = Calendar.getInstance();
                        parseCalender.setTime(new SimpleDateFormat(pattern).parse(dateAsText));
                        date = (T) parseCalender;
                    }
                    else{
                        throw new IllegalArgumentException("Input Type is Error");
                    }
                    break;
                }catch (Exception e){
                }
            }
            if(date != null) break;
            System.out.println("Please enter valid date !!!");
            System.out.println();
        }while(true);
    }

    public void printDateInformations(){
        if(this.date.getClass().equals(LocalDate.class)){
            System.out.println("--------------------JAVA08-----------------------");
            System.out.println(DateTimeFormatter.ofPattern("dd MMMM yyyy 'is a' EEEE").format((LocalDate)this.date));
            System.out.println();
            System.out.println("Additional facts");
            System.out.println("* " + "It is the day number " + ((LocalDate)this.date).getDayOfYear()
                                    + " of the year, " + (((LocalDate)this.date).lengthOfYear() - ((LocalDate)this.date).getDayOfYear())
                                    + " days left.");
            getDayCountInMonth();
            System.out.println("* " + "Year " + ((LocalDate)this.date).getYear()
                                    + " has " + ((LocalDate)this.date).lengthOfYear()
                                    + " days.");

            System.out.println("* " + ((LocalDate)this.date).getMonth().toString()
                                    + " " + ((LocalDate)this.date).getYear()
                                    +" has " + ((LocalDate)this.date).lengthOfMonth()
                                    + " days.");
        }
        else if(this.date.getClass().equals(GregorianCalendar.class)){
            System.out.println("--------------------JAVA07-----------------------");
            System.out.println(new SimpleDateFormat("dd MMMM yyyy 'is a' EEEE").format(((GregorianCalendar)this.date).getTime()));
            System.out.println();
            System.out.println("Additional facts");
            System.out.println("* " + "It is the day number " + ((GregorianCalendar)this.date).get(Calendar.DAY_OF_YEAR)
                                    + " of the year, " + (((GregorianCalendar)this.date).getActualMaximum(Calendar.DAY_OF_YEAR) - ((GregorianCalendar)this.date).get(Calendar.DAY_OF_YEAR))
                                    + " days left.");
            getDayCountInMonth();
            System.out.println("* " + "Year " + ((GregorianCalendar)this.date).get(Calendar.YEAR)
                                    + " has " + ((GregorianCalendar)this.date).getActualMaximum(Calendar.DAY_OF_YEAR)
                                    + " days.");

            System.out.println("* " + ((GregorianCalendar)this.date).getDisplayName(Calendar.MONTH,Calendar.LONG, Locale.getDefault())
                                    + " " + ((GregorianCalendar)this.date).get(Calendar.YEAR)
                                    + " has " + ((GregorianCalendar)this.date).getActualMaximum(Calendar.DAY_OF_MONTH)
                                    + " days.");
        }
    }

    public void getDayCountInMonth(){
        if(this.date.getClass().equals(GregorianCalendar.class)){
            int countInMonth = 0;
            int countInYear = 0;
            int indexInMonth = 0;
            int indexInYear = 0;
            Calendar c = Calendar.getInstance();
            c.setTimeInMillis(((Calendar)this.date).getTimeInMillis());
            c.set(Calendar.DAY_OF_YEAR, 1);
            int lengthYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
            for (int i = 0; i < lengthYear; i++) {
                if(c.get(Calendar.DAY_OF_WEEK) == ((Calendar)this.date).get(Calendar.DAY_OF_WEEK)) {
                    if(c.get(Calendar.MONTH) == ((Calendar)this.date).get(Calendar.MONTH)){
                        countInMonth++;
                    }
                    countInYear++;
                    if(c.equals(this.date)){
                        indexInYear = countInYear;
                        indexInMonth = countInMonth;
                    }
                    c.add(Calendar.DAY_OF_YEAR, 7);
                    if(c.get(Calendar.YEAR) != ((Calendar)this.date).get(Calendar.YEAR)) break;
                }
                else{
                    c.add(Calendar.DAY_OF_YEAR, 1);
                }
            }
            System.out.println("* " + "It is " + ((GregorianCalendar)this.date).getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()) + " number " + indexInYear + " out of " + countInYear + " in " + ((GregorianCalendar)this.date).get(Calendar.YEAR) + ".");
            System.out.println("* " + "It is " + ((GregorianCalendar)this.date).getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault()) + " number " + indexInMonth + " out of " + countInMonth + " in " + ((GregorianCalendar)this.date).getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " " + ((GregorianCalendar)this.date).get(Calendar.YEAR) + ".");
        }
        else{
            int countInMonth = 0;
            int indexInMonth = 0;
            int countInYear = 0;
            int indexInYear = 0;
            LocalDate c = ((LocalDate)this.date).withDayOfYear(1);
            int lengthYear = ((LocalDate)this.date).lengthOfYear();
            for (int i = 0; i < lengthYear; i++) {
                if(c.getDayOfWeek().getValue() == ((LocalDate)this.date).getDayOfWeek().getValue()) {
                    if(c.getMonth().getValue() == ((LocalDate)this.date).getMonth().getValue()){
                        countInMonth++;
                    }
                    countInYear++;
                    if(c.equals(this.date)){
                        indexInYear = countInYear;
                        indexInMonth = countInMonth;
                    }
                    c = c.plusWeeks(1);
                    if(c.getYear() != ((LocalDate)this.date).getYear()) break;
                }
                else{
                    c = c.plusDays(1);
                }
            }
            System.out.println("* " + "It is " + ((LocalDate)this.date).getDayOfWeek().toString() + " number " + indexInYear + " out of " + countInYear + " in " + ((LocalDate)this.date).getYear() + ".");
            System.out.println("* " + "It is " + ((LocalDate)this.date).getDayOfWeek().toString() + " number " + indexInMonth + " out of " + countInMonth + " in " + ((LocalDate)this.date).getMonth().toString() + " " + ((LocalDate)this.date).getYear() + ".");
        }
    }

    public void untilNow() {
        if (this.date.getClass().equals(GregorianCalendar.class)) {
            Calendar cNow = Calendar.getInstance();
            Calendar cFirst = Calendar.getInstance();
            cFirst.setTimeInMillis(((Calendar) this.date).getTimeInMillis());
            int days = 0;
            int tmp = 0;
            long times = cNow.getTimeInMillis() - cFirst.getTimeInMillis();
            times = times/(1000);//to second
            tmp = (int)(times/3600)/24; // to days
            days += tmp;
            System.out.print("You Have Lived : \n");
            System.out.println(days + " days\n");
        } else {
            LocalDate StartDate = (LocalDate) this.date;
            LocalDate EndDate = LocalDate.now();
            if (!EndDate.isAfter(StartDate)) {
                System.out.println("Please Enter Valid Date");
                return;
            }
            Period period = Period.between(StartDate, EndDate);
            period.get(ChronoUnit.DAYS);
            long p2 = ChronoUnit.DAYS.between(StartDate, EndDate);
            System.out.print("You Have Lived : \n");
            System.out.println(p2 + " day\n");
        }
    }
}
