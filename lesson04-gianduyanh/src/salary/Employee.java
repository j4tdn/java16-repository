package salary;

import java.time.LocalDate;

public class Employee extends User{
	private String unitname;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, LocalDate date, float coefficientsalary,String unitname) {
		super();
		this.name = name;
		this.date = date;
		this.coefficientsalary = coefficientsalary;
		this.unitname = unitname;
	}
	public String getUnitname() {
		return unitname;
	}
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	
	@Override
	public float slary() {
		this.slary = this.coefficientsalary * 12500;
		return this.slary;
	}
	 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "[unitname : " + this.unitname +  " ] slary " +slary();
	}
	



}
