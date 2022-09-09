package ex04.bean;

import java.time.LocalDate;

public class Employee extends Workers{
	String nameOfDepartment;

	public Employee() {

	}

	public Employee(String name, LocalDate birthday, Double salarygrade,String nameOfDepartment) {
		super(name, birthday, salarygrade);
		this.nameOfDepartment = nameOfDepartment;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", birthday=" + birthday
				+ ", salarygrade=" + salarygrade + ",nameOfDepartment="+ nameOfDepartment +"]";
	}
	public Double salary() {
		Double salary;
		salary = (this.salarygrade) *1250000;
		return salary;
		
	}
	
	

}
