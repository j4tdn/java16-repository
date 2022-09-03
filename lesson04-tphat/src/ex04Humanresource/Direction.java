package ex04Humanresource;

import java.time.LocalDate;

public class Direction extends Person {
	private int factorJob;

	public Direction() {

	}

	public Direction(String name, LocalDate dateBirthday, double factorSalary, int factorJob) {
		super(name, dateBirthday, factorSalary);
		this.factorJob = factorJob;
	}

	public int getFactorJob() {
		return factorJob;
	}

	public void setFactorJob(int factorJob) {
		this.factorJob = factorJob;
	}

	@Override
	public double salary() {

		return (this.getFactorSalary() + this.getFactorJob()) * 3000000;
	}

	@Override
	public String toString() {
		return "Direction [Name: " + getName() + ", DateBirthday: " + getDateBirthday() + ", FactorSalary: "
				+ getFactorSalary() + ", factorJob: " + factorJob + "]";
	}

}
