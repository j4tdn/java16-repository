package companymanagement;

import java.time.LocalDate;

public class Employees extends Person{
	private String departmentName;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, LocalDate dateOfBirth, int salary) {
		super(name, dateOfBirth, salary);
		// TODO Auto-generated constructor stub
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public Employees withDepartmentName(String departmentName) {
		this.departmentName = departmentName;
		return this;
	}

	@Override
	public String toString() {
		return "Employees [departmentName=" + departmentName + ", getDepartmentName()=" + getDepartmentName()
				+ ", getName()=" + getName() + ", getDateOfBirth()=" + getDateOfBirth() + ", getSalary()=" + getSalary()
				+ ", calSalary()=" + calSalary() +  "]";
	}

	@Override
	public int calSalary() {
		return this.getSalary()*1250000;
	}
}
