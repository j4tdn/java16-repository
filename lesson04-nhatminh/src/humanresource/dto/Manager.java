package humanresource.dto;

import java.time.LocalDate;

public class Manager extends Personnel {
	private final int numberOfEmployee;

	public Manager(String id, String name, LocalDate birth, Double salaryCoefficient, int numberOfEmployee) {
		super(id, name, birth, salaryCoefficient);
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}

	// BUILDER
	public static class ManagerBuilder {
		private String id;
		private String name;
		private LocalDate birth;
		private Double salaryCoefficient;
		private int numberOfEmployee;

		public ManagerBuilder(String id, String name) {
			this.id = id;
			this.name = name;
		}

		public ManagerBuilder withBirth(LocalDate birth) {
			this.birth = birth;
			return this;
		}

		public ManagerBuilder withSalaryCoefficient(Double salaryCoefficient) {
			this.salaryCoefficient = salaryCoefficient;
			return this;
		}

		public ManagerBuilder withNumberOfEmployee(int numberOfEmployee) {
			this.numberOfEmployee = numberOfEmployee;
			return this;
		}

		public Manager build() {
			valiLocalDateUserObject();
			Manager manager = new Manager(this.id, this.name, this.birth, this.salaryCoefficient,
					this.numberOfEmployee);
			return manager;
		}

		private void valiLocalDateUserObject() {
			// Do some validations to check
		}
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", birth=" + birth + ", salaryCoefficient=" + salaryCoefficient
				+ ", numberOfEmployee=" + numberOfEmployee + "]";
	}

}
