package ex04_employeemanagement;

import java.time.LocalDate;

public class Director extends Person{
	private int serviceNumber;
	
	public Director() {
	}

	public Director(String name, LocalDate birthday, int salaryCoeff, int serviceNumber) {
		super(name, birthday, salaryCoeff);
		this.serviceNumber = serviceNumber;
	}

	public double getServiceNumber() {
		return serviceNumber;
	}

	public void setServiceNumber(int serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	@Override
	public double salary(){
		return ((getSalaryCoeff() + getServiceNumber()) * 3000000);
	}
	@Override
	public String toString() {
		return "Director:  fullName:" + getName() + ", dayOfBirth=" + getDayOfBirth() + ", salaryCoeff=" + getSalaryCoeff() + 
			"serviceNumber: "	+getServiceNumber()+ " salary: " +salary()+"]";
	}
}
