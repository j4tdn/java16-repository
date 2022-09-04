package ex04Human;

import java.time.LocalDate;

public class Director extends Human {
	private double position;

	public Director() {

	}

	public Director(String name, LocalDate birthday, double salary, double position) {
		super(name, birthday, salary);
		this.position = position;
	}

	public double getPosition() {
		return position;
	}

	public void setPosition(double position) {
		this.position = position;
	}

	@Override
	public double Salary() {
		return (this.getSalary() + this.getPosition()) * 3000000;
	}

}
