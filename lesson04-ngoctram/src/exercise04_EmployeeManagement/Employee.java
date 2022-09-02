package exercise04_EmployeeManagement;

import java.time.LocalDate;

public class Employee extends Person {
	private String department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, LocalDate dateOfBirth, double salaryCoeffiency, String department) {
		super(name, dateOfBirth, salaryCoeffiency);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public Employee withDepartment(String department) {
		this.department = department;
		return this;
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", getName()=" + getName() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getSalaryCoeffiency()=" + getSalaryCoeffiency() + "]";
	}
	
	@Override
	public double calculateSalary() {
		return this.getSalaryCoeffiency() * 1250000;
	}
}
