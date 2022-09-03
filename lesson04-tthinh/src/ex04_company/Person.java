package ex04_company;

import java.time.LocalDate;

public abstract class Person {
	private String name;
	private LocalDate dateOfBirth;
	private double salaryCoe;
	
	public Person() {
		
	}

	public Person(String name, LocalDate dateOfBirth, double salaryCoe) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salaryCoe = salaryCoe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getSalaryCoe() {
		return salaryCoe;
	}

	public void setSalaryCoe(double salaryCoe) {
		this.salaryCoe = salaryCoe;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dateOfBirth=" + dateOfBirth + ", salaryCoe=" + salaryCoe + "]";
	}

	
	
	
}
