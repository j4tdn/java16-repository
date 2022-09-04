package ex04management;

import java.time.LocalDate;

public abstract class People {

	private String name;
	private LocalDate datebirth;
	private float salary;
	
	public People()
	{
		
	}
	public People(String name, LocalDate datebirth, float salary) {
		super();
		this.name = name;
		this.datebirth = datebirth;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDatebirth() {
		return datebirth;
	}

	public void setDatebirth(LocalDate datebirth) {
		this.datebirth = datebirth;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public abstract float calSalary();
	
}
