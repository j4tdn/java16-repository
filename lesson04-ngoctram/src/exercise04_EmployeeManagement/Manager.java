package exercise04_EmployeeManagement;

import java.time.LocalDate;

public class Manager extends Person{
	private int numberOfEmployees;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, LocalDate dateOfBirth, double salaryCoeffiency, int numberOfEmployees) {
		super(name, dateOfBirth, salaryCoeffiency);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public Manager withNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
		return this;
	}

	@Override
	public String toString() {
		return "Manager [numberOfEmployees=" + numberOfEmployees + ", getName()=" + getName() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getSalaryCoeffiency()=" + getSalaryCoeffiency() + "]";
	}
	
	@Override
	public double calculateSalary() {
		return this.getSalaryCoeffiency() * 2200000;
	}
}
