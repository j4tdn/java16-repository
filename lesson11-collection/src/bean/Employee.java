package bean;

import java.util.Objects;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;

	public Employee() {
	}

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		// Cung 1 gia tri thi co cung hashCode
		return Objects.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		// Xet dia chi --> Ep kieu
		if (this == obj)
			return false;
		if (!(obj instanceof Employee))
			return false;
		return getId().equals(((Employee) obj).getId());
	}

}
