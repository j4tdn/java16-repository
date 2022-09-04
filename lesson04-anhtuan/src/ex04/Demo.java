package ex04;

import java.time.LocalDate;

public class Demo {
	public static void main(String[] args) {
		Director d = new Director("Phan Anh Tuan",LocalDate.of(1999, 12, 05),2.5,2);
		Manager m = new Manager("Lionel Messi", LocalDate.of(198, 6, 24), 3.2, 10);
		Staff s1= new Staff("Ronaldo", LocalDate.of(1985, 2, 5),1.5,"football");
		Staff s2 = new Staff("Java",LocalDate.of(2000, 1, 1), 1.5, "back-end");
		
		System.out.println(d.toString());
		System.out.println(m.toString());
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println(d.salaryy());
		System.out.println(m.salary());
		System.out.println(s1.salary());
		System.out.println(s2.salary());
	}
	
	

}
