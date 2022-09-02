package exercise04_EmployeeManagement;

import java.time.LocalDate;

public class Demo {
	public static void main(String[] args) {
		Director director = ((Director) new Director()
								.withName("Jasmine")
								.withDateOfBirth(LocalDate.of(2002, 7, 5))
								.withSalaryCoeffiency(3.8))
								.withPosCoffiency(2);
		
		Manager manager = ((Manager) new Manager()
								.withName("Mark")
								.withDateOfBirth(LocalDate.of(1993, 9, 5))
								.withSalaryCoeffiency(3.5))
								.withNumberOfEmployees(3);
		
		Employee employee1 = ((Employee) new Employee()
								.withName("Bella")
								.withDateOfBirth(LocalDate.of(1997, 10, 10))
								.withSalaryCoeffiency(3))
								.withDepartment("IT");
		
		Employee employee2 = ((Employee) new Employee()
								.withName("Hadid")
								.withDateOfBirth(LocalDate.of(2000, 8, 4))
								.withSalaryCoeffiency(3))
								.withDepartment("Finance");
		
		System.out.println(director);
		System.out.println("=> Salary: " + director.calculateSalary() + "\n");
		System.out.println(manager);
		System.out.println("=> Salary: " + manager.calculateSalary() + "\n");
		System.out.println(employee1);
		System.out.println("=> Salary: " + employee1.calculateSalary() + "\n");
		System.out.println(employee2);
		System.out.println("=> Salary: " + employee2.calculateSalary() + "\n");
	}
}
