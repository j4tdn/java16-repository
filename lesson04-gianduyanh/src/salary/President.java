package salary;

import java.time.LocalDate;

public class President extends User {
	private float jobcoefficient;

	public float getJobcoefficient() {
		return jobcoefficient;
	}

	public void setJobcoefficient(float jobcoefficient) {
		this.jobcoefficient = jobcoefficient;
	}
	
	public President() {
		
	}
	public President(String name, LocalDate date, float coefficientsalary,float jobcoefficient) {
		super();
		this.name = name;
		this.date = date;
		this.coefficientsalary = coefficientsalary;
		this.jobcoefficient = jobcoefficient;
		

	}
	@Override
	public float slary() {
		this.slary = (this.coefficientsalary + this.jobcoefficient)* 30000;
		return this.slary;
	}
	@Override
	public String toString() {
		
		return super.toString() + "[Jobcoefficient : " + this.jobcoefficient + "] slary " +slary();
	}

}
