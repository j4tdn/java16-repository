package ex04humanresource;

import java.time.LocalDate;

public abstract class Person {
	private String fullname;
	private LocalDate birthday;
	private int coeffsalary;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String fullname, LocalDate birthday, int coeffsalary) {
		super();
		this.fullname = fullname;
		this.birthday = birthday;
		this.coeffsalary = coeffsalary;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public int getCoeffsalary() {
		return coeffsalary;
	}

	public void setCoeffsalary(int coeffsalary) {
		this.coeffsalary = coeffsalary;
	}

	@Override
	public String toString() {
		return "Person [fullname=" + fullname + ", birthday=" + birthday + ", coeffsalary=" + coeffsalary + "]";
	}

	public abstract int salary();
}
