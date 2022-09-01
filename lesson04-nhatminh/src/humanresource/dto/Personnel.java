package humanresource.dto;

import java.time.LocalDate;

public abstract class Personnel {
	protected final String id;
	protected final String name;
	protected final LocalDate birth;
	protected final Double salaryCoefficient;

	public Personnel(String id, String name, LocalDate birth, Double salaryCoefficient) {
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.salaryCoefficient = salaryCoefficient;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirth() {
		return birth;
	}

	public Double getSalaryCoefficient() {
		return salaryCoefficient;
	}
}
