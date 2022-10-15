package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

//ứng dụng hẹn hò
public class Ex06DatingTime {
public static void main(String[] args) {
	LocalDateTime start =LocalDateTime.of(2018, 8, 1, 23, 10,10);
	LocalDateTime end = LocalDateTime.now();
	
	if(end.isBefore(start)) {
		throw new IllegalArgumentException("StratDay must less than Enđay");
		
	}
	LocalDate startDate = start.toLocalDate();
	LocalTime startTime = start.toLocalTime();//20:37-->in ra kết quả âm
	//-->if(duration.isNegative())
	
	LocalDate endDate = end.toLocalDate();
	LocalTime endTime = end.toLocalTime();
	
	Period period = Period.between(startDate, endDate);
	Duration duration = Duration.between(startTime, endTime);
	
	if(duration.isNegative()) {//if(startime>endtime)// nếu duration bị âm
		duration=duration.plusDays(1);//duration+1 ngày
		period=period.minusDays(1);//period - 1 ngày
		//c.add(Calendar.DAY_OF_MONTH,1);
	}
	
	System.out.println("formatted \n"  
		    +period.getYears()       +" years \n"
		    +period.getMonths()      +" month \n"
		    +period.getDays()        +" day \n"
		    +duration.toHoursPart()  +" hours \n"
		    +duration.toMinutesPart()+" minutes \n"
		    +duration.toSecondsPart()+" seconds \n"
		   );
}
}
