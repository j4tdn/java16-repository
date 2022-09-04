package ex04_employeemanagement;

import java.time.LocalDate;

public class Employee extends Person{
	private String nameOfDepartment;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, LocalDate birthday, int salaryCoeff, String nameOfDepartment) {
		super(name, birthday, salaryCoeff);
		this.nameOfDepartment = nameOfDepartment;
	}
	public String getNameOfDepartment() {
		return nameOfDepartment;
	}
	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}
	@Override
	public double salary(){
		return getSalaryCoeff() * 1250000;
	}
	@Override
	public String toString() {
		return "Employee: " + "fullname:" + getName() + ", birthday:" + getDayOfBirth() + ", coeffsalary:"
				+ getSalaryCoeff() + " ,nameofdepartment :" + nameOfDepartment + "salary : " + salary();
	}
}
