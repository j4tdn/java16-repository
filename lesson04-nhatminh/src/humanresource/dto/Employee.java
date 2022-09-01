package humanresource.dto;

import java.time.LocalDate;

public class Employee extends Personnel {
	private final String departmentName;

	public Employee(String id, String name, LocalDate birth, Double salaryCoefficient, String departmentName) {
		super(id, name, birth, salaryCoefficient);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	// BUILDER
	public static class EmployeeBuilder {
		private String id;
		private String name;
		private LocalDate birth;
		private Double salaryCoefficient;
		private String departmentName;

		public EmployeeBuilder(String id, String name) {
			this.id = id;
			this.name = name;
		}

		public EmployeeBuilder withBirth(LocalDate birth) {
			this.birth = birth;
			return this;
		}

		public EmployeeBuilder withSalaryCoefficient(Double salaryCoefficient) {
			this.salaryCoefficient = salaryCoefficient;
			return this;
		}

		public EmployeeBuilder withDeparmentName(String departmentName) {
			this.departmentName = departmentName;
			return this;
		}

		public Employee build() {
			valiLocalDateUserObject();
			Employee manager = new Employee(this.id, this.name, this.birth, this.salaryCoefficient,
					this.departmentName);
			return manager;
		}

		private void valiLocalDateUserObject() {
			// Do some validations to check
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", birth=" + birth + ", salaryCoefficient=" + salaryCoefficient
				+ ", departmentName=" + departmentName + "]";
	}

}
