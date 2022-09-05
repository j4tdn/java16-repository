package humanresourcemanagement;

import java.time.LocalDate;

public class Peolpe {
	private String name;
	private LocalDate birthday;
	private double salarycoefficient;
	
	public Peolpe() {
		
	}

	public Peolpe(String name, LocalDate birthday, double salarycoefficient) {
		this.name = name;
		this.birthday = birthday;
		this.salarycoefficient = salarycoefficient;
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

	public double getSalarycoefficient() {
		return salarycoefficient;
	}

	public void setSalarycoefficient(int salarycoefficient) {
		this.salarycoefficient = salarycoefficient;
	}

	@Override
	public String toString() {
		return "Peolpe [name=" + name + ", birthday=" + birthday + ", salarycoefficient=" + salarycoefficient + "]";
	}
}
