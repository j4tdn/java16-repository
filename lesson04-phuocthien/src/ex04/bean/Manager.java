package ex04.bean;

import java.time.LocalDate;

public class Manager extends Workers {

	int numberOfEmployees;

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public Manager() {
	}

	public Manager(String name, LocalDate birthday, Double salarygrade,int numberOfEmployees) {
		super(name, birthday, salarygrade);
		this.numberOfEmployees = numberOfEmployees;
	}
	public Double salary() {
		Double salary;
		salary = (this.salarygrade) *2200000;
		return salary;
		
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", birthday=" + birthday
				+ ", salarygrade=" + salarygrade + ",numberOfEmployees=" + numberOfEmployees + "]";
	}
	
	
	
}
