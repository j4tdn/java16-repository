package ex04;

import java.time.LocalDate;

public class Director extends Father {
	private int jobcoefficient;
	
	public Director() {
		
	}

	public Director(String fullname, LocalDate dateofbirth, double coefficientssalary,int jobcoefficient) {
		super( fullname, dateofbirth, coefficientssalary);
		this.jobcoefficient = jobcoefficient;
	}

	public int getJobcoefficient() {
		return jobcoefficient;
	}

	public void setJobcoefficient(int jobcoefficient) {
		this.jobcoefficient = jobcoefficient;
	}

	@Override
	public String toString() {
		return "Director [ fullname=" + fullname + ", dateofbirth=" + dateofbirth
				+ ", coefficientssalary=" + coefficientssalary + "jobcoefficient=" + jobcoefficient +"]";
	}
	public double salaryy() {
		return (this.coefficientssalary + this.jobcoefficient) * 3000;
	}

	
	

		

}

