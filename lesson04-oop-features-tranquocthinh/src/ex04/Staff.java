package ex04;

import java.time.LocalDate;

public class Staff extends Personnel {
	private String departmentName;

	public Staff() {
		super();
	}

	public Staff(String name, LocalDate dateOfBith, float hsl ,String departmentName) {
		super(name, dateOfBith, hsl);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public float salary() {
		return (super.hsl * 125000);
	}
	@Override
	public String toString() {
		return super.toString() + "departmentName: " + departmentName;
	}
	
	
	
	

}
