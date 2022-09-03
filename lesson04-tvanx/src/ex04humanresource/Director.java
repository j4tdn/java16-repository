package ex04humanresource;

import java.time.LocalDate;

public class Director extends Person {
	private int coeffjob;

	public Director() {
		// TODO Auto-generated constructor stub
	}

	public Director(String fullname, LocalDate birthday, int coeffsalary, int coeffjob) {
		super(fullname, birthday, coeffsalary);
		this.coeffjob = coeffjob;
	}

	public int getCoeffjob() {
		return coeffjob;
	}

	public void setCoeffjob(int coeffjob) {
		this.coeffjob = coeffjob;
	}

	@Override
	public int salary() {
		return (getCoeffsalary() + getCoeffjob()) * 3000000;
	}

	@Override
	public String toString() {
		return "Director => " + "fullname:" + getFullname() + ", birthday:" + getBirthday() + ", coeffsalary:"
				+ getCoeffsalary() + "coeffjob:" + coeffjob + "salary: " + salary();
	}
}
