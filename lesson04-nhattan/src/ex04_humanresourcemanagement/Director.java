package ex04_humanresourcemanagement;

import java.time.LocalDate;

public class Director extends Member {
	public static final double basicPay = 3000000;
	
	private float jobCoef;
	
	public Director() {
	}

	public Director(String fullname, LocalDate birthday, float coefSalary, float jobCoef) {
		super(fullname, birthday, coefSalary);
		this.jobCoef = jobCoef;
	}

	public float getJobCoef() {
		return jobCoef;
	}

	public void setJobCoef(float jobCoef) {
		this.jobCoef = jobCoef;
	}
	
	@Override
	public void enterInfo() {
		System.out.println("--- Giám đốc ---");
		super.enterInfo();
		System.out.println("Nhập hệ số chức vụ: ");
		jobCoef = Float.parseFloat(ip.nextLine());
	}
	
	@Override
	public double payroll() {
		return (getCoefSalary() + getJobCoef()) * basicPay;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("\t%-5s", "Giám đốc");
	}
	
}
