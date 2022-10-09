package view;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        //JAVA 08
        DateCustomes<LocalDate> FirstDate = new DateCustomes<>(LocalDate.now());
        FirstDate.input("First");
        FirstDate.printDateInformations();

        //JAVA 07
        System.out.println();
        DateCustomes<Calendar> SecondDate = new DateCustomes<>(Calendar.getInstance());
        SecondDate.input("Second");
        SecondDate.printDateInformations();

    }
}
