package ex04_employeemanagement;

import java.time.LocalDate;

public abstract class Person {
	private String name;
	private LocalDate dayOfBirth;
	private int salaryCoeff;

	public Person() {
	}

	public Person(String name, LocalDate dayOfBirth, int salaryCoeff) {
		super();
		this.name = name;
		this.dayOfBirth = dayOfBirth;
		this.salaryCoeff = salaryCoeff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(LocalDate dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getSalaryCoeff() {
		return salaryCoeff;
	}

	public void setSalaryCoeff(int salaryCoeff) {
		this.salaryCoeff = salaryCoeff;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dayOfBirth=" + dayOfBirth + ", salaryCoeff=" + salaryCoeff + "]";
	}

	public abstract double salary();
	
}
