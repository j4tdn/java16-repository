package ex04Human;

import java.time.LocalDate;

public abstract class Human {
	private String name;
	private LocalDate birthday;
	private double salary;

	public Human() {

	}

	public Human(String name, LocalDate birthday, double salary) {
		this.name = name;
		this.birthday = birthday;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public abstract double Salary();

	@Override
	public String toString() {
		return "Human [name=" + name + ", birthday=" + birthday + ", salary=" + salary + "]";
	}
}
