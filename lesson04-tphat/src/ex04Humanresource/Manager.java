package ex04Humanresource;

import java.time.LocalDate;

public class Manager extends Person {
	private int amountEmployee;

	public Manager() {

	}

	public Manager(String name, LocalDate dateBirthday, double factorSalary, int amountEmployee) {
		super(name, dateBirthday, factorSalary);
		this.amountEmployee = amountEmployee;
	}

	public int getAmountEmployee() {
		return amountEmployee;
	}

	public void setAmountEmployee(int amountEmployee) {
		this.amountEmployee = amountEmployee;
	}

	@Override
	public double salary() {
		return this.getFactorSalary() * 2200000;
	}

	@Override
	public String toString() {
		return "Manager [Name: " + getName() + ", DateBirthday: " + getDateBirthday() + ", FactorSalary: "
				+ getFactorSalary() + ", amountEmployee: " + amountEmployee + "]";
	}

}
