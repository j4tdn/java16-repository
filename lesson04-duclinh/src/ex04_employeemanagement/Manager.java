package ex04_employeemanagement;

import java.time.LocalDate;

public class Manager extends Person{
	private int numberOfStaff;

	public Manager() {
	}
	public Manager(String name, LocalDate birthday, int salaryCoeff, int numberOfStaff) {
		super(name, birthday, salaryCoeff);
		this.numberOfStaff = numberOfStaff;
	}
	public int getNumberOfStaff() {
		return numberOfStaff;
	}
	public void setNumberofstaff(int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}
	
	@Override
	public double salary(){
		return getSalaryCoeff() * 2200000;
	}
	@Override
	public String toString() {
		return "Manager:  fullName:" + getName() + ", dayOfBirth=" + getDayOfBirth() + ", salaryCoeff=" + getSalaryCoeff() + 
			"numberOfStaff: "	+getNumberOfStaff()+ " salary: " +salary()+"]";
	}
	
}
