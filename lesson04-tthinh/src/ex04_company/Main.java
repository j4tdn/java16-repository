package ex04_company;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Director dr = new Director("Nguyễn Văn A", LocalDate.of(2001, 02, 21), 10, 10);
		Manager ma = new Manager("Lê Văn B", LocalDate.of(1999, 11, 11), 8, 100);
		Staff st1 = new Staff("Trần Văn Một", LocalDate.of(2002, 03, 04),6, "Front-end");
		Staff st2 = new Staff("Võ Văn Hai", LocalDate.of(2003, 07, 06),6, "Back-end");
		
		System.out.println(dr.toString());
		System.out.println(ma.toString());
		System.out.println(st1.toString());
		System.out.println(st2.toString());;
	}
}
