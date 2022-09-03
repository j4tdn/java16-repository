package ex04Humanresource;

import java.time.LocalDate;

public class Employee extends Person {
	private String unitName;

	public Employee() {

	}

	public Employee(String name, LocalDate dateBirthday, double factorSalary, String unitName) {
		super(name, dateBirthday, factorSalary);
		this.unitName = unitName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	@Override
	public double salary() {
		return this.getFactorSalary() * 1250000;
	}

	@Override
	public String toString() {
		return "Employee [Name: " + getName() + ", Birthday: " + getDateBirthday() + ", FactorSalary: "
				+ getFactorSalary() + ", unitName: " + unitName + "]";
	}

}
