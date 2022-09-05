package humanresourcemanagement;

import java.time.LocalDate;

public class Director extends Peolpe {
	private int position;

	public Director() {
		
	}

	public Director(String name, LocalDate birthday, double salarycoefficient, int position) {
		super(name, birthday, salarycoefficient);
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Director " + "fullname:" + getName() + ", birthday: " + getBirthday() + ", coeffsalary: "
				+ getSalarycoefficient() + ", positioncoe: " + getPosition() + ", salary: " + salary();
	}

	public double salary() {
		return (getSalarycoefficient() + getPosition()) * 3000000;
	}

}