package ex04.view;

import java.time.LocalDate;

import ex04.bean.Director;
import ex04.bean.Employee;
import ex04.bean.Manager;
import ex04.bean.Workers;

public class ManagementDemo {
	public static void main(String[] args) {

		Director director1 = new Director("hung", LocalDate.of(2002, 9, 1), 2.5, 2);
		Manager manager1 = new Manager("thien", LocalDate.of(2000, 2, 3), 1.5, 100);
		Employee employee1 = new Employee("huy", LocalDate.of(1999, 9, 10), 1.0, "nhân sự");
		Employee employee2 = new Employee("dat", LocalDate.of(1998, 3, 1), 1.2, "kế toán");

		System.out.println("Info of ");
		System.out.println(director1);
		System.out.println(manager1);
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println("------------");

		System.out.printf("Salary of director:" + "%,.0f", director1.salary());
		System.out.println("");
		System.out.printf("Salary of manager:" + "%,.0f", manager1.salary());
		System.out.println("");
		System.out.printf("Salary of employee:" + "%,.0f", employee1.salary());
		System.out.println("");
		System.out.printf("Salary of employee:" + "%,.0f", employee2.salary());

	}

}
