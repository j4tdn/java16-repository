package humanresource.dto;

import java.time.LocalDate;

public class Director extends Personnel {
	private final Double positionCoefficient;

	public Director(String id, String name, LocalDate birth, Double salaryCoefficient, Double positionCoefficient) {
		super(id, name, birth, salaryCoefficient);
		this.positionCoefficient = positionCoefficient;
	}

	public Double getPositionCoefficient() {
		return positionCoefficient;
	}

	// BUILDER
	public static class DirectorBuilder {
		private String id;
		private String name;
		private LocalDate birth;
		private Double salaryCoefficient;
		private Double positionCoefficient;

		public DirectorBuilder(String id, String name) {
			this.id = id;
			this.name = name;
		}

		public DirectorBuilder withBirth(LocalDate birth) {
			this.birth = birth;
			return this;
		}

		public DirectorBuilder withSalaryCoefficient(Double salaryCoefficient) {
			this.salaryCoefficient = salaryCoefficient;
			return this;
		}

		public DirectorBuilder withPositionCoefficient(Double positionCoefficient) {
			this.positionCoefficient = positionCoefficient;
			return this;
		}

		public Director build() {
			valiLocalDateUserObject();
			Director director = new Director(this.id, this.name, this.birth, this.salaryCoefficient,
					this.positionCoefficient);
			return director;
		}

		private void valiLocalDateUserObject() {
			// Do some validations to check
		}
	}

	@Override
	public String toString() {
		return "Director [id=" + id + ", name=" + name + ", birth=" + birth + ", salaryCoefficient=" + salaryCoefficient
				+ ", positionCoefficient=" + positionCoefficient + "]";
	}

}
