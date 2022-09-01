package humanresource.management;

import java.time.LocalDate;

import humanresource.dto.Director;
import humanresource.dto.Employee;
import humanresource.dto.Manager;
import humanresource.dto.Personnel;

public class Program {
	public static void main(String[] args) {
		// Seeding
		Director d1 = new Director.DirectorBuilder("D001", "Tran Nhat Minh").withBirth(LocalDate.now())
				.withSalaryCoefficient(3.5).withPositionCoefficient(4.5).build();
		Manager m1 = new Manager.ManagerBuilder("M001", "Nguyen Van A").withBirth(LocalDate.now())
				.withSalaryCoefficient(3.0).withNumberOfEmployee(10).build();
		Employee e1 = new Employee.EmployeeBuilder("E001", "Nguyen Van B").withBirth(LocalDate.now())
				.withSalaryCoefficient(2.1).withDeparmentName("Keangnam").build();
		Employee e2 = new Employee.EmployeeBuilder("E002", "Nguyen Van C").withBirth(LocalDate.now())
				.withSalaryCoefficient(1.8).withDeparmentName("Landmark81").build();
		Personnel[] personnels = { d1, m1, e1, e2 };

		// Demo
		Utils.showAllInfo(personnels);
		System.out.println();
		Utils.showInfowithSalary(personnels);
	}
}
