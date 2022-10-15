package localdatetime;

import java.time.LocalDate;
import java.time.Period;

//hiệu giữa 2 mốc thời gian

public class Ex02LocalDatePeriod {
	public static void main(String[] args) {
		//localDate: xử lý ngày tháng năm
		//Period: tìm khoảng cách thời gian từ start-->end
		//2 kiểu dữ liệu của start và end phải là LocalDate
		
		LocalDate start = LocalDate.now();
		LocalDate end =LocalDate.of(2022, 12, 31);//truyền vào ngày tháng năn cho end

		//LocalDate.ofYearDay(0, 0) truyền vào ngày 115 năm 2022--> biết 
		//ngày mấy tháng mấy
		
		Period period=Period.between(start, end);//Inclusive: [ lấy cả nó, Exclusive : ) không tính nó
		System.out.println("period: " +period);//p2y2m28d
		System.out.println("toString --> \n"
				+ period.getYears() + "year");
	}



}
