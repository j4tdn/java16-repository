package ex04Human;

import java.time.LocalDate;

public class Manager extends Human{
	private int people;
	
	public Manager() {
	
	}
	public Manager(String name, LocalDate birthday, double salary, int people) {
		super(name, birthday, salary);
		this.people=people;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	@Override
	public double Salary() {
		return this.getSalary() * 2200000;
	}
	@Override
	public String toString() {
		return "Manager [people=" + people + "]";
	}
}
	
		

	