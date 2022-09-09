package ex04.bean;

import java.time.LocalDate;

public class Workers {
	protected String name;
	protected LocalDate birthday;
	protected Double salarygrade;
	public Workers() {
		
	}
	public Workers(String name, LocalDate birthday, Double salarygrade) {
		this.name = name;
		this.birthday = birthday;
		this.salarygrade = salarygrade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public Double getSalaryGrade() {
		return salarygrade;
	}
	public void setSalaryGrade(Double salarygrade) {
		this.salarygrade = salarygrade;
	}
	@Override
	public String toString() {
		return "Workers [name=" + name + ", birthday=" + birthday + ", salary grade=" + salarygrade + "]";
	}
	
	
	
	

}
