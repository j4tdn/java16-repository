package ex04personnel;

import java.time.LocalDate;

public class Ex02Personnel {
	public static void main(String[] args) {
		Director dir = new Director("Hoang", LocalDate.of(1996, 2, 12), 5, 4);
		System.out.println(dir);
		System.out.println("Salary of Director: " + dir.salary());
		
		Manager man = new Manager("Minh", LocalDate.of(1999, 9, 17), 4, 2);
		System.out.println(man);
		System.out.println("Salary of Manager: " + man.salary());
		
		Employees emp1 = new Employees("Tuan", LocalDate.of(1998, 8, 22), 3, "Nhan Su");
		System.out.println(emp1);
		System.out.println("Salary of Employees 1: " +  emp1.salary());
		
		Employees emp2 = new Employees("Thien", LocalDate.of(1999, 8, 24), 3, "Ke Toan");
		System.out.println(emp2);
		System.out.println("Salary of Employees 2: " +  emp2.salary());

	}
}
