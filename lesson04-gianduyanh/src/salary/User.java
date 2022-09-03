package salary;

import java.time.LocalDate;

public  class User {
	protected String name;
	protected LocalDate date;
	protected float coefficientsalary;
	protected float slary;

	public User() {

	}

	@Override
	public String toString() {
		return "User [name=" + name + ", date=" + date + ", coefficientsalary=" + coefficientsalary +  
				"]";
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public float getCoefficientsalary() {
		return coefficientsalary;
	}

	public void setCoefficientsalary(float coefficientsalary) {
		this.coefficientsalary = coefficientsalary;
	}

	public float getSlary() {
		return slary;
	}

	public void setSlary(float slary) {
		this.slary = slary;
	}

	



	public float slary() {
		return 0;
	}

}
