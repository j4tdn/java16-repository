package ex04;

import java.time.LocalDate;

public class Staff extends Father {
	private String departmentname;
	
	public Staff() {
		
	}

	public Staff(String fullname, LocalDate dateofbirth, double coefficientssalary,String departmentname) {
		super(fullname, dateofbirth, coefficientssalary);
		this.departmentname = departmentname;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	@Override
	public String toString() {
		return "Staff [fullname=" + fullname + ", dateofbirth=" + dateofbirth
				+ ", coefficientssalary=" + coefficientssalary + "departmentname=" + departmentname + "]";
	}
	public double salary() {
		return this.coefficientssalary * 1250000;
	}
	

	

}
