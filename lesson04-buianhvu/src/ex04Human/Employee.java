package ex04Human;

import java.time.LocalDate;

public class Employee extends Human{
	
	private String Department;
	
	public Employee() {
		
	}
	public Employee(String name, LocalDate birthday, double salary, String Department) {
		super(name, birthday, salary);
		this.Department=Department;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	public double Salary() {
		return this.getSalary() * 1250000;
	}

	@Override
	public String toString() {
		return "Employee [Department=" + Department + "]";
	}
}
	