package ex04;

import java.time.LocalDate;

public class Father {
	protected String fullname;
	protected LocalDate dateofbirth;
	protected double coefficientssalary; 
	
	public Father() {
		
	}

	public Father(String fullname, LocalDate dateofbirth, double coefficientssalary) {
		super();
		this.fullname = fullname;
		this.dateofbirth = dateofbirth;
		this.coefficientssalary = coefficientssalary;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public double getCoefficientssalary() {
		return coefficientssalary;
	}

	public void setCoefficientssalary(double coefficientssalary) {
		this.coefficientssalary = coefficientssalary;
	}

	@Override
	public String toString() {
		return "Father [fullname=" + fullname + ", dateofbirth=" + dateofbirth + ", coefficientssalary="
				+ coefficientssalary + "]";
	}

	
	
	
}
