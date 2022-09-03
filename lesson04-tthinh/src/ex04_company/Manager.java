package ex04_company;

import java.time.LocalDate;

public class Manager extends Person {
	private int numberOfManagermentStaff;

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, LocalDate dateOfBirth, double salaryCoe, int numberOfManagermentStaff) {
		super(name, dateOfBirth, salaryCoe);
		this.numberOfManagermentStaff = numberOfManagermentStaff;
	}

	public int getNumberOfManagermentStaff() {
		return numberOfManagermentStaff;
	}

	public void setNumberOfManagermentStaff(int numberOfManagermentStaff) {
		this.numberOfManagermentStaff = numberOfManagermentStaff;
	}

	@Override
	public String toString() {
		return "Manager " + "fullname: " + getName() + ", birthday: " + getDateOfBirth() + ", coeffsalary: "
				+ getSalaryCoe() + ", numberofstaff: " + getNumberOfManagermentStaff() + ", salary: " + salary();
	}

	public double salary() {
		return getSalaryCoe() * 2200000;

	}

}
