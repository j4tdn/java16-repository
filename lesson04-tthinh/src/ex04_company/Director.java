package ex04_company;

import java.time.LocalDate;

public class Director extends Person {
	private int positionCoe;

	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(String name, LocalDate dateOfBirth, double salaryCoe, int positionCoe) {
		super(name, dateOfBirth, salaryCoe);
		this.positionCoe = positionCoe;
	}

	public int getPositionCoe() {
		return positionCoe;
	}

	public void setPositionCoe(int positionCoe) {
		this.positionCoe = positionCoe;
	}

	@Override
	public String toString() {
		return "Director " + "fullname:" + getName() + ", birthday: " + getDateOfBirth() + ", coeffsalary: "
				+ getSalaryCoe() + ", positioncoe: " + getPositionCoe() + ", salary: " + salary();
	}

	public double salary() {
		return (getSalaryCoe() + getPositionCoe()) * 3000000;
	}

}
