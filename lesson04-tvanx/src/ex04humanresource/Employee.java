package ex04humanresource;

import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person {
	private String nameofdepartment;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String fullname, LocalDate birthday, int coeffsalary, String nameofdepartment) {
		super(fullname, birthday, coeffsalary);
		this.nameofdepartment = nameofdepartment;
	}

	public String getNameofdepartment() {
		return nameofdepartment;
	}

	public void setNameofdepartment(String nameofdepartment) {
		this.nameofdepartment = nameofdepartment;
	}

	@Override
	public int salary() {
		return getCoeffsalary() * 1250000;
	}

	@Override
	public String toString() {
		return "Employee => " + "fullname:" + getFullname() + ", birthday:" + getBirthday() + ", coeffsalary:"
				+ getCoeffsalary() + "nameofdepartment:" + nameofdepartment + "salary: " + salary();
	}

}
