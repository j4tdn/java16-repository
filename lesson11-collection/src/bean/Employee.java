package bean;

import java.util.Objects;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Employee() {

	}

	public Employee(Integer id, String name, double i) {
		
		this.id = id;
		this.name = name;
		this.salary = i;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Employee)) {
			return false;
		}
		return super.equals(obj);
	}
	

	

}
