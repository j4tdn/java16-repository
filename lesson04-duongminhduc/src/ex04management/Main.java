package ex04management;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		President a = new President();
		a.setName("DuongMinhDuc");
		a.setDatebirth(LocalDate.of(2002, 3, 4));
		a.setSalary(11);
		a.setJobcoefficient(22);
		
		Manager b = new Manager();
		b.setName("NhatSang");
		b.setDatebirth(LocalDate.of(2002, 11, 4));
		b.setSalary(12);
		b.setNumberofemployees(8);
		
		Employee c = new Employee();
		c.setName("ChinhHieu");
		c.setDatebirth(LocalDate.of(2002, 9, 18));
		c.setSalary(13);
		c.setUnitname("P5");
		
		Employee d = new Employee();
		d.setName("HongTruong");
		d.setDatebirth(LocalDate.of(2002, 8, 17));
		d.setSalary(17);
		d.setUnitname("P6");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
