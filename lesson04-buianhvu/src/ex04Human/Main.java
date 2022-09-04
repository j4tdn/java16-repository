package ex04Human;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Director director = new Director("Toro", LocalDate.of(1978, 8, 07), 4.7, 5.4);
		Manager manager = new Manager("Slimz", LocalDate.of(1989, 7, 15), 3.4, 2);
		Employee e1 = new Employee("Yorn", LocalDate.of(1996, 5, 12), 1.3, "Sales");
		Employee e2 = new Employee("Violet", LocalDate.of(1998, 7, 11), 10, "Sales");
		


		System.out.println("Salary of Director is: " + director.Salary());
		System.out.println("Salary of Manager is: " + manager.Salary());
		System.out.println("Salary of Yorn is: " + e1.Salary());
		System.out.println("Salary of Violet: " + e2.Salary());


	}
}
