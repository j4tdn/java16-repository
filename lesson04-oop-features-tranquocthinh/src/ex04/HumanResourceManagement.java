package ex04;

import java.time.LocalDate;

public class HumanResourceManagement {

	public static void main(String[] args) {
		Director d1 = new Director("Trần Quốc Thịnh", LocalDate.of(2001, 11, 26), 12, 15);
		System.out.println(d1);
		System.out.println("=============================================================================");
		
		Manager m1 = new Manager("Nguyễn Công Phượng", LocalDate.of(1995, 01, 21), (float) 12.7, 50);
		System.out.println(m1);
		System.out.println("=============================================================================");

		
		Staff s1 = new Staff("Lê Thị Minh Anh", LocalDate.of(2001, 05, 16), (float) 10.99, "Digital Marketing");
		System.out.println(s1);
		System.out.println("=============================================================================");

		
		Staff s2 = new Staff("Trương Thị Mỹ Uyên", LocalDate.of(2001, 10, 31), (float) 9.969, "Business Administration");
		System.out.println(s2);

		

	}

}
