package salary;

import java.time.LocalDate;

public class Manager extends User {
	private int managementstaff;
	
	public Manager() {
		
	}
	
	public Manager(String name, LocalDate date, float coefficientsalary,int managementstaff ) {
		super();
		this.name = name;
		this.date = date;
		this.coefficientsalary = coefficientsalary;
		this.managementstaff = managementstaff;
	}

	public int getManagementstaff() {
		return managementstaff;
	}

	public void setManagementstaff(int managementstaff) {
		this.managementstaff = managementstaff;
	}
	@Override
	public float slary() {
		this.slary = this.coefficientsalary * 22000;
		return this.slary;
	}

	@Override
	public String toString() {
		
		return super.toString() + "[Managementstaff : " + this.managementstaff + "] slary " +slary();
	}
	
	
	

}
