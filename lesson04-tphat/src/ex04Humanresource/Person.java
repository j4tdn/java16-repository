package ex04Humanresource;

import java.time.LocalDate;

public abstract class Person {
	private String name;
	private LocalDate dateBirthday;
	private double factorSalary;
	
	public Person() {
		
	}

	public Person(String name, LocalDate dateBirthday, double factorSalary) {
		this.name = name;
		this.dateBirthday = dateBirthday;
		this.factorSalary = factorSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateBirthday() {
		return dateBirthday;
	}

	public void setDateBirthday(LocalDate dateBirthday) {
		this.dateBirthday = dateBirthday;
	}

	public double getFactorSalary() {
		return factorSalary;
	}

	public void setFactorSalary(double factorSalary) {
		this.factorSalary = factorSalary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateBirthday=" + dateBirthday + ", factorSalary=" + factorSalary + "]";
	}
	
	public abstract double salary();
}
