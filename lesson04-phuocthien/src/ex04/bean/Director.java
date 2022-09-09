package ex04.bean;

import java.time.LocalDate;

public class Director extends Workers{
	int hscv;

	public Director() {
	}

	public Director(String name, LocalDate birthday, Double salarygrade,int hscv) {
		super(name, birthday, salarygrade);
		this.hscv = hscv;
		// TODO Auto-generated constructor stub
	}
	

	public int getHscv() {
		return hscv;
	}

	public void setHscv(int hscv) {
		this.hscv = hscv;
	}
	public Double salary() {
		Double salary;
		salary = (this.salarygrade + this.hscv) *3000000;
		return salary;
		
	}
	

	@Override
	public String toString() {
		return "Director [ name=" + name + ", birthday=" + birthday + ", salary grade=" + salarygrade + ",hscv=" + hscv + "]";
	}
	
	
	
	
	
	
	
}
