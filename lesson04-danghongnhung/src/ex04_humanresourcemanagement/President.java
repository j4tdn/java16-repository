package ex04_humanresourcemanagement;

import java.util.Date;

public class President extends Person {
	private double jobCoefficient;
	
	
	public President(String fullname, Date birthDay, double coefSalary,double jobCoefficient) {
		super(fullname, birthDay, coefSalary);
		this.jobCoefficient = jobCoefficient;
	}



	public double getJobCoefficient() {
		return jobCoefficient;
	}

	public void setJobCoefficient(double jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}

	@Override
	public String toString() {
		return "President \n Fullname: " + getFullname() + "\n BirthDay: "+ getBirthDay() 
		+ "\n CoefSalary: " + getCoefSalary() + "\n jobCoefficient: " + jobCoefficient +" \n Salary: "+salary();
	}

	@Override
	public long salary() {
		return (long) (this.getCoefSalary() + this.getJobCoefficient()) * 3000000;
	}
	
}
