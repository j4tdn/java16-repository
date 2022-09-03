package companymanagement;

import java.time.LocalDate;

public class President extends Person{
	private int job;
	
	public President() {
		// TODO Auto-generated constructor stub
	}

	public President(String name, LocalDate dateOfBirth, int salary , int job) {
		super(name, dateOfBirth, salary);
		this.job = job;
	}

	public int getJob() {
		return job;
	}

	public President withJob(int job) {
		this.job = job;
		return this;
	}
	
	

	@Override
	public String toString() {
		return "Director [Name = " + getName() + ", DateOfBirth = "
				+ getDateOfBirth() + ", SalaryCoeffiency() = " + getSalary() + "job = " + job 
				+ "]";
	}

	@Override
	public int calSalary() {
		return (this.getSalary() + this.getJob() * 3000000);
	}
	
	
	
}
