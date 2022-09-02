package exercise04_EmployeeManagement;

import java.time.LocalDate;

public abstract class Person {
	private String name;
	private LocalDate dateOfBirth;
	private double salaryCoeffiency;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, LocalDate dateOfBirth, double salaryCoeffiency) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salaryCoeffiency = salaryCoeffiency;
	}

	public String getName() {
		return name;
	}

	public Person withName(String name) {
		this.name = name;
		return this;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public Person withDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public double getSalaryCoeffiency() {
		return salaryCoeffiency;
	}

	public Person withSalaryCoeffiency(double salaryCoeffiency) {
		this.salaryCoeffiency = salaryCoeffiency;
		return this;
	}
	
	public abstract double calculateSalary();
}
