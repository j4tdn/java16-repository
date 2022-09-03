package ex04humanresource;

import java.time.LocalDate;
import java.util.Date;

public class HeadOfDepartment extends Person {
	private int numberofstaff;

	public HeadOfDepartment() {
		// TODO Auto-generated constructor stub
	}

	public HeadOfDepartment(String fullname, LocalDate birthday, int coeffsalary, int numberofstaff) {
		super(fullname, birthday, coeffsalary);
		this.numberofstaff = numberofstaff;
	}

	public int getNumberofstaff() {
		return numberofstaff;
	}

	public void setNumberofstaff(int numberofstaff) {
		this.numberofstaff = numberofstaff;
	}

	@Override
	public int salary() {
		return getCoeffsalary() * 2200000;
	}

	@Override
	public String toString() {
		return "Head of department => " + "fullname:" + getFullname() + ", birthday:" + getBirthday() + ", coeffsalary:"
				+ getCoeffsalary() + "numberofstaff: " + numberofstaff + "salary: " + salary();
	}

}
