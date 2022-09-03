package companymanagement;

import java.time.LocalDate;

public class AppDemo {
	public static void main(String[] args) {
		President president = new President();
		president.withName("john");
		president.withDateOfBirth(LocalDate.of(2001, 2, 5));
		president.withSalary(3);
		president.withJob(2);
		
		Manager manager = new Manager();
		manager.withName("Karma");
		manager.withDateOfBirth(LocalDate.of(1998, 10, 10));
		manager.withSalary(2);
		manager.withNumOfEmployee(2);
		
		Employees emp1 = new Employees();
		emp1.withName("Vi");
		emp1.withDateOfBirth(LocalDate.of(1999, 10, 10));
		emp1.withSalary(1);
		emp1.withDepartmentName("Math");
		
		Employees emp2 = new Employees();
		emp2.withName("Ashe");
		emp2.withDateOfBirth(LocalDate.of(1997, 10, 10));
		emp2.withSalary(1);
		emp2.withDepartmentName("IT");
		
							
				
				
		
		System.out.println(president);
		System.out.println("--> Salary: " + president.calSalary() + "\n");
		System.out.println(manager);
		System.out.println("--> Salary: " + manager.calSalary() + "\n");
		System.out.println(emp1);
		System.out.println("--> Salary: " + emp1.calSalary() + "\n");
		System.out.println(emp2);
		System.out.println("--> Salary: " + emp2.calSalary() + "\n");		
	}
					
}