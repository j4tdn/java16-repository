package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex04LocalTimeDuration {
	//duration: tính khoảng cách thời gian giờ phút giây

	public static void main(String[] args) {
LocalTime end =  LocalTime.of(18, 24, 35);
LocalTime start= LocalTime.now();

Duration duration = Duration.between(start, end);


System.out.println("duration " + duration);
System.out.println("toString--> \n"
		+duration.toHoursPart() +"hours\n"
		+duration.toMinutesPart() +"minutes\n"
		+duration.toSecondsPart() +"seconds");
	}

}
