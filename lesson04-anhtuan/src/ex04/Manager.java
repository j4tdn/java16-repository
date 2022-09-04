package ex04;

import java.time.LocalDate;

public class Manager extends Father {
	private int numberofemployees;
	
	public Manager() {
		
	}

	public Manager(String fullname, LocalDate dateofbirth, double coefficientssalary,int numberofemployees) {
		super(fullname, dateofbirth, coefficientssalary);
		this.numberofemployees = numberofemployees;
	}

	public int getNumberofemployees() {
		return numberofemployees;
	}

	public void setNumberofemployees(int numberofemployees) {
		this.numberofemployees = numberofemployees;
	}

	@Override
	public String toString() {
		return "Manager [fullname=" + fullname + ", dateofbirth="
				+ dateofbirth + ", coefficientssalary=" + coefficientssalary + "numberofemployees=" + numberofemployees +  "]";
	}
	public double salary() {
		return this.coefficientssalary * 2200000;
	}
	

	
	

}
