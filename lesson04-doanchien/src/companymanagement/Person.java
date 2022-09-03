package companymanagement;

import java.time.LocalDate;

public abstract class Person {
	private String name;
	private LocalDate dateOfBirth;
	private int salary;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, LocalDate dateOfBirth, int salary) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
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

	public int getSalary() {
		return salary;
	}

	public Person withSalary(int salary) {
		this.salary = salary;
		return this;
	}
	
	public abstract int calSalary();
	
}
