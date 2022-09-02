package exercise04_EmployeeManagement;

import java.time.LocalDate;

public class Director extends Person {
	private int posCoffiency;
	
	public Director(String name, LocalDate dateOfBirth, double salaryCoeffiency, int posCoffiency) {
		super(name, dateOfBirth, salaryCoeffiency);
		this.posCoffiency = posCoffiency;
	}
	
	public Director() {
		// TODO Auto-generated constructor stub
	}
	
	public int getPosCoffiency() {
		return posCoffiency;
	}

	public Director withPosCoffiency(int posCoffiency) {
		this.posCoffiency = posCoffiency;
		return this;
	}

	@Override
	public String toString() {
		return "Director [Name = " + getName() + ", DateOfBirth = "
				+ getDateOfBirth() + ", SalaryCoeffiency() = " + getSalaryCoeffiency() + "posCoffiency = " + posCoffiency 
				+ "]";
	}

	@Override
	public double calculateSalary() {
		return (this.getSalaryCoeffiency() + this.getPosCoffiency()) * 3000000;
	}
}
