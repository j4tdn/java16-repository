package companymanagement;

import java.time.LocalDate;

public class Manager extends Person{
	private int numOfEmployee;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	

	public Manager(String name, LocalDate dateOfBirth, int salary, int numberOfEmployee) {
		super(name, dateOfBirth, salary);
		this.numOfEmployee = numOfEmployee;
	}

	

	public int getNumOfEmployee() {
		return numOfEmployee;
	}


	public Manager withNumOfEmployee(int numOfEmployee) {
		this.numOfEmployee = numOfEmployee;
		return this;
	}

	

	@Override
	public String toString() {
		return "Manager [numOfEmployee=" + numOfEmployee + ", getNumOfEmployee()=" + getNumOfEmployee()
				+ ", calSalary()=" + calSalary() + "]";
	}


	@Override
	public int calSalary() {
		return this.getSalary()*2200000;
	}

}
