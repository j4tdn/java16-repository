package ex04_company;

import java.time.LocalDate;

public class Staff extends Person {
	private String deparmentName;

	public Staff() {
	}

	public Staff(String name, LocalDate dateOfBirth, double salaryCoe, String deparmentName) {
		super(name, dateOfBirth, salaryCoe);
		this.deparmentName = deparmentName;
	}

	public String getDeparmentName() {
		return deparmentName;
	}

	public void setDeparmentName(String deparmentName) {
		this.deparmentName = deparmentName;
	}

	@Override
	public String toString() {
		return "Staff " + "fullname: " + getName() + ", birthday: " + getDateOfBirth() + ", coeffsalary: "
				+ getSalaryCoe() + ", deparmentname: " + getDeparmentName() + ", salary: " + salary();
	}

	public double salary() {
		return getSalaryCoe() * 1250000;
	}
}
